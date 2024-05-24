package test.mypac;

public class FruitBox<T> {	// <> angle bracket
	// field
	private T item;
	
	// 과일을 포장하는 method
	public void pack(T item) {
		this.item = item;
	}
	
	// 과일을 꺼내는 method
	public T unPack() {
		return item;
	}
}
