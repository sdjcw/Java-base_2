package equals.transitive;

public class Example {
	public static void main(String[] args) {
		System.out.println(new Point(1, 2).equals(new ColorPoint(1, 2, "red")));
		System.out.println(new ColorPoint(1, 2, "black").equals(new Point(1, 2)));
		System.out.println( //
				new ColorPoint(1, 2, "red").equals(new ColorPoint(1, 2, "black")));
	}
}

class Point {
	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;
		Point p = (Point) o;
		return p.x == x && p.y == y;
	}
}

class ColorPoint extends Point {

	private final String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	// ÊÇ·ñ¸²¸Çequals£¿
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point))
			return false;

		if (!(o instanceof ColorPoint)) {
			return o.equals(this);
		}
		return super.equals(o) && ((ColorPoint) o).color == color;
	}
}