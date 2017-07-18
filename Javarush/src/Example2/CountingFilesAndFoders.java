package Example2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class CountingFilesAndFoders {
   static int countFolder = 0;
   static int countFiles = 0;
   static long countSize = 0;
   
    public static void main(String[] args) throws IOException {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	//BufferedReader reader = Files.newBufferedReader(reader.readLine(), StandardCharsets.UTF_8);
    	Path path = Paths.get(reader.readLine());
    	reader.close();
    	
    	if(!Files.isDirectory(path)){
    		System.out.println(path.toAbsolutePath().toString() + " - не папка");
    	}
    	
    	Files.walkFileTree(path, new MyFileVisitor());
        System.out.println("Всего папок - " + (countFolder-1));
        System.out.println("Всего файлов - " + countFiles);
        System.out.println("Общий размер - " + countSize);
    }


    static class MyFileVisitor extends SimpleFileVisitor <Path> {
		@Override
		public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
			countFolder++;
			return super.preVisitDirectory(dir, attrs);
		}

		@Override
		public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			countFiles++;
			countSize += attrs.size();
			return super.visitFile(file, attrs);
		}
    }


    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }
}

//C:\Users\Viachaslau_Amelin\Desktop\Examples