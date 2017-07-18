package tryWithResources;

/* 
Улучшения в Java 7 (try-with-resources)
*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public void printFile1() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples\\example1.txt");){
            int data = fileInputStream.read();
            while (data != -1) {
                System.out.print(data + " ");
                data = fileInputStream.read();
            }
            System.out.println();
        }
    }

    public void printFile2() throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples\\example1.txt");
        	BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
            int data = bufferedInputStream.read();
            while (data != -1) {
                System.out.print(data + " ");
                data = bufferedInputStream.read();
            }
        }
    }

    public static void main(String[] args) throws IOException {
    	Solution s = new Solution();
    	s.printFile1();
    	System.out.println("//////////////////////////////////////////////////////////////////////////");
    	s.printFile2();
    }
}