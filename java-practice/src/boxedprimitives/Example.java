package boxedprimitives;

import java.util.Comparator;

public class Example {

	public static void main(String[] args) {
		Comparator<Integer> naturalOrder = new Comparator<Integer>() {
			public int compare(Integer first, Integer second) {
				return first < second ? -1 : (first == second ? 0 : 1);
			}
		};
		System.out.println(naturalOrder.compare(new Integer(1), new Integer(1)));
	}
	

}
