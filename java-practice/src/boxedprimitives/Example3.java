package boxedprimitives;

public class Example3 {

	public static void main(String[] args) {
		long currentTime = System.currentTimeMillis();
		Long sum = 0L;
		for (long i = 0; i < 50000000; i++) {
			sum += i;
		}
		System.out.println("result: " + sum);
		System.out.println(System.currentTimeMillis() - currentTime);
	}

}