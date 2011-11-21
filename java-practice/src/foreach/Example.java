package foreach;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example {

	/**
	 * Ï£ÍûÊä³ö£º
	 * red:A 
	 * red:B 
	 * red:C 
	 * yellow:A 
	 * yellow:B 
	 * yellow:C 
	 * blue:A 
	 * blue:B 
	 * blue:C
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] color = new String[] { "red", "yellow", "blue" };
		String[] letters = new String[] { "A", "B", "C" };
		
		List<String> colorList = Arrays.asList(color);
		List<String> letterList = Arrays.asList(letters);
		
		for (Iterator<String> i = colorList.iterator(); i.hasNext();) {
			for (Iterator<String> j = letterList.iterator(); j.hasNext();)
				System.out.println(i.next() + ":" + j.next());
		}
		
//		for (String c : color) {
//			for (String letter : letters) {
//				System.out.println(c + ":" + letter);
//			}
//		}
	}
}
