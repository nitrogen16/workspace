import java.util.Comparator;


class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();
		
		if (len1 > len2){
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		return 0;
	}
}
