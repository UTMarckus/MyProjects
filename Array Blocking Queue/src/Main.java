import java.util.ArrayList;

public class Main {

	private static ArrayList<Object> list = new ArrayList<Object>();

	public static void main(String[] args) {

		addObject();
		proceed();

	}

	private static void addObject() {
		for (int i = 0; i < 5; i++) {
			list.add(new Object());
		}
	}

	private static void proceed() {
		System.out.println(list.size());
		
		while(list.size()!=0) {
			Object obj = new Object();
			for (Object el : list) {
				obj = el;
				break;
			}
			list.remove(obj);
		}
		
		System.out.println(list.size());
	}

}
