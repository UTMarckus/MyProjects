import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<Object>(1000);

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
