package Example2;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples");
        Path path2 = Paths.get("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples\\Zipped Folder\\");
        Path resultPath = getDiffBetweenTwoPaths(path1, path2);
        System.out.println(resultPath);   //expected output '../secondDir/third' or '..\secondDir\third'
    }

    public static Path getDiffBetweenTwoPaths(Path path1, Path path2) {
        return path1.relativize(path2);
    }
}
