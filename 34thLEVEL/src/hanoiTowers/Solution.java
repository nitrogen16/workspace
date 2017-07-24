package hanoiTowers;

/* 
Ханойские башни
*/

public class Solution {
    public static void main(String[] args) {
        int count = 3;
        moveRing('A', 'B', 'C', 3);
    }

    public static void moveRing(char a, char b, char c, int count) {
    	
    	if(count > 1){
    		moveRing(a, c, b, count - 1);
    		System.out.println("from A to C");
    		moveRing(c, b, a, count - 1);
    		System.out.println("from C to B");
    		moveRing(b, c, a, count - 1);
    		System.out.println("from B to C");
    		return;
    	}else{
    		System.out.println("from A to B");
    		return;
    	}
    }
}