package main;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
/* 
Построй дерево(1)
*/
//Класс, описывающий дерево
public class CustomTree extends AbstractList implements Cloneable, Serializable {
	Entry<String> root;
	public static void main(String[] args) {
		List<String> list = new CustomTree();

		for (int i = 1; i < 16; i++) {
			list.add(String.valueOf(i));
		}
		// System.out.println("Expected 3, actual is " + ((CustomTree)
		// list).getParent("8"));
		list.remove("5");
		// System.out.println("Expected null, actual is " + ((CustomTree)
		// list).getParent("11"));
	}

	public <T> void add(String s){
		
	}
	
	@Override
	public int size() {
		return 0;
	}
	
    @Override
    public String get(int index){
        throw new UnsupportedOperationException();
    }

    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }

	@Override
	public boolean addAll(int index, Collection c) {
		throw new UnsupportedOperationException();
	}
	
	// класс, описывающий тип элементов дерева
	static class Entry<T> implements Serializable{
		String elementName;
		int lineNumber;
		boolean availableToAddLeftChildren;
		boolean availableToAddRightChildren;
		Entry<T> parent;
		Entry<T> leftChild;
		Entry<T> rightChild;

		public Entry(String elementName) {
			this.elementName = elementName;
			availableToAddLeftChildren = true;
			availableToAddRightChildren = true;
		}
		
        public void checkChildren(){
            if(leftChild != null){
                availableToAddLeftChildren = false;
            }
            if(rightChild != null){
                availableToAddRightChildren = false;
            }
        }
        
        public boolean isAvailableToAddChildren(){
        	if(!availableToAddLeftChildren && !availableToAddRightChildren){
        		return false;
        	}else{
        		return true;
        	}
        }
	}
}
