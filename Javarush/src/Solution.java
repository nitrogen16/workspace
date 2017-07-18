
public class Solution {

    public static void main(String[] args) {
    	//String[] symbols = {".", "x", "X", "^"};
    	//System.out.println(symbols[0]);
    	int[][] mas = new int[5][10];
    	for(int i = 0; i < 5; i++){
    		for(int j = 0; j < 9; j++){
    			mas[i][j] = 2;
    			System.out.print(mas[i][j]);
    		}
    		System.out.println();
    	}
    	
    	
    	String[] symbols = {".", "x", "X", "^"};
    	for(int i = 0; i < 5; i++){
    		for(int j = 0; j < 10; j++){
    			System.out.print(symbols[mas[i][j]]);
    		}
    		System.out.println();
    	}
    }
}



// C:/Users/Viachaslau_Amelin/Desktop/Examples/example1.txt
// C:/Users/Viachaslau_Amelin/Desktop/Examples/example2.txt