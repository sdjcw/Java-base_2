package equals.symmetric;

public class Example {
	
	public static void main(String[] args) {
		CaseInsensitiveString cs = new CaseInsensitiveString("HelloWorld!");
		System.out.println(cs.equals("helloworld!"));
		System.out.println("helloworld!".equals(cs));
	}
	
}

class CaseInsensitiveString {

	private final String s;

	public CaseInsensitiveString(String s) {
		if (s == null)
			throw new NullPointerException();
		this.s = s;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof CaseInsensitiveString)
			return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
		if (o instanceof String)
			return s.equalsIgnoreCase((String) o);
		return false;
	}

}