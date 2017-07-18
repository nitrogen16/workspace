import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class SortMountains {
	LinkedList <Mountain> mtn = new LinkedList <Mountain>();
	
	class NameCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return one.name.compareTo(two.name);
		}
	}
	
	class HeightCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return (two.height - one.height);
		}
	}
	
	public static void main(String[] args) {
		SortMountains sortMountain = new SortMountains();
		sortMountain.go();
	}

	public void go(){
		mtn.add(new Mountain ("Long Age", 14255));
		mtn.add(new Mountain ("Albert", 10500));
		mtn.add(new Mountain ("Maroon", 17000));
		mtn.add(new Mountain ("Castle", 25000));
		
		System.out.println("В порядке добавления: \n" + mtn);
		
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("По названию: \n" + mtn);
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("По высоте: \n" + mtn);
	}
	
	class Mountain{
		String name;
		int height;
		Mountain(String n, int h){
			name = n;
			height = h;
		}
		public String toString(){
			return name + " " + height;
		}
	}

}
