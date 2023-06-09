package generics;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("element 1");
		list.addElement("element 2");
		String value = list.get(0);
		
		System.out.println(list);
		System.out.println(value);

		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(10));
		Integer number = list2.get(0);
		
		System.out.println(list2);
		System.out.println(number);
	}

}
