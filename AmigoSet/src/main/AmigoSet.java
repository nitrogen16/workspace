package main;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AmigoSet<E> extends AbstractSet implements Serializable, Cloneable, Set{
	
    private final static Object PRESENT = new Object();
    private transient HashMap<E,Object> map;
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}