
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] values = {3, 5, 7};// one dimensional
		//System.out.println(values[2]);
		
		int[][] grid = {
				{3, 5, 2343},//row 0
				{2, 4},//row 1
				{1, 2, 3, 4}//row 2
		};
		
		grid[1][1] = 5454;//[row][position]
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		System.out.println(grid[2][3]);
		
		String[][] texts = new String[2][3];//[rows][columns]
		System.out.println(texts[0][1]);
		texts[0][1] = "Hello there!!!";
		System.out.println(texts[0][1]);
		
		
		System.out.println("These are the elements of GRID array: ");
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println();
		}
		
		
		String[][] words = new String[2][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][1] = "Hi there";
		System.out.println(words[0][1]);
	}

}
