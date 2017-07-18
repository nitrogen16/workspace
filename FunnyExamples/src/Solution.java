import java.util.ArrayList;
import java.util.List;


public class Solution {

	public static void main(String[] args){
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(value1);
		Integer intValue1 = (Integer) value1.getValue();
		System.out.println(intValue1);

		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world");
		System.out.println(value2);
		String intValue2 = value2.getValue();
		System.out.println(intValue2);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		System.out.println("Список до обработки дженерик-методом: " + intList);
		Utilities.fill(intList, 150);
		System.out.println("Список после обработки дженерик-методом: " + intList);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(10000);
		list1.add(12500);
		printList(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("qwe");
		list2.add("qwerty");
		list2.add("qwerasdf");
		printList(list2);
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		System.out.println(sum(list1));
		
		System.out.println("///////////////////////////////////////////////////////////////////////////////////");
		
		List<? super Integer> list3 = new ArrayList<Integer>();
		list3.add(3);
		list3.add(300);
		list3.add(33500);
		System.out.println("The intList is: " + list3);
	}
	
	static void printList(List<?> list){
		for(Object item : list){
			System.out.println("{" + item + "}");
		}
	}
	
	//Bounded wildcards
	static Double sum(List<? extends Number> numList){
		Double result = 0.0;
		for(Number item : numList){
			result += item.doubleValue();
		}
		return result;
	}

}