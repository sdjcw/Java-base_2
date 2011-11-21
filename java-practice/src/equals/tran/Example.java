package equals.tran;

import java.util.HashSet;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		Point p = new Point(1, 2);
		Set<Point> set = new HashSet<Point>();
		set.add(p);
		System.out.println(set.contains(new Point(1, 2)));
		
		p.setX(2);
		System.out.println(set.contains(new Point(1, 2)));
		System.out.println(set.contains(new Point(2, 2)));
		
		for (Point temp : set) {
			if (temp.equals(p)) {
				System.out.println("OK, temp.equals(p)");
				System.out.println("temp.x = " + temp.getX() +", temp.y = " + temp.getY());
			}
		}
	}

}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

}
