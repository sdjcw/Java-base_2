package stringappend;

public class Example {

	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		String result = "";
		for (int i = 0; i < 10000; i++) {
			result += "string";
		}
		System.out.println(System.currentTimeMillis() - currentTime);
		
		long currentTime2 = System.currentTimeMillis();
		StringBuilder result2 = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			result2.append("string");
		}
		System.out.println(System.currentTimeMillis() - currentTime2);
	}

}