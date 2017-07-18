package Example2;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class HiddenFilesSearch extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        final HiddenFilesSearch solution = new HiddenFilesSearch();
        Files.walkFileTree(Paths.get("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples"), options, 20, solution);

        List<String> result = solution.getArchived();
        System.out.println("All archived files:");
        for (String path : result) {
            System.out.println("\t" + path);
        }

        List<String> failed = solution.getFailed();
        System.out.println("All failed files:");
        for (String path : failed) {
            System.out.println("\t" + path);
        }
        
    }

    @Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
    	archived.add(file.toString());
    	return super.visitFile(file, attrs);
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		failed.add(file.toString());
		return FileVisitResult.SKIP_SUBTREE;
	}

	private List<String> archived = new ArrayList<>();
    private List<String> failed = new ArrayList<>();

    public List<String> getArchived() {
        return archived;
    }

    public List<String> getFailed() {
        return failed;
    }
}
//C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples
