package classesMetodosGenericos;

public class Pair<K,V> {

	private K key;
	private V value;
	
	// Por Pair não conhecer a estrutura de K e V, eles podem ser de qualquer tipo
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}