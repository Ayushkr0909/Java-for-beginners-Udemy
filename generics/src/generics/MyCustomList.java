package generics;

import java.util.ArrayList;

public class MyCustomList<T> {  //have generalized it by adding <T>
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T element) {
	    list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}
	
	public String toString() {
		return list.toString();
	}

	public T get(int index) {
		return list.get(index);
	}
}
