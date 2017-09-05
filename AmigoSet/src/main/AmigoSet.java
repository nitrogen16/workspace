package main;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
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

	public AmigoSet(HashMap<E, Object> map) {
		super();
		this.map = map;
	}

	public AmigoSet() {
		map = new HashMap<>();
	}

	public AmigoSet(Collection<? extends E> collection){
		map = new HashMap<>((int)Math.max(16,collection.size()/.75f));
		this.addAll(collection);
	}

}
