package strategy;

import java.io.Serializable;

public class Entry implements Serializable{
	
	private static final long serialVersionUID = -1824556671426188546L;
	
	Long key;
	String value;
	Entry next;
	int hash;
	
	public Entry(int hash, Long key, String value, Entry next) {
		this.key = key;
		this.value = value;
		this.next = next;
		this.hash = hash;
	}
	
	public Long getKey(){
		return key;
	}
	
	public String getValue(){
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return key + "=" + value;
	}
	
}
