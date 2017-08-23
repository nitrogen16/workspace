package hanoiTowers;

/* 
Ханойские башни
*/

public class Solution {
	public static void main(String[] args) {
		int count = 3;
		moveRing('A', 'B', 'C', count);
	}

	public static void moveRing(char a, char b, char c, int count) {
		if (count == 0) {
			return;
		}
		// c = (char) (64 + 64 + 64 + 6 - a - b);
		moveRing(a, c, b, count - 1);
		System.out.println("from " + a + " to " + b);
		moveRing(c, b, a, count - 1);
	}
}