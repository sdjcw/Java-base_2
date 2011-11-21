package hashcode;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Map<Id, User> m = new HashMap<Id, User>();
		m.put(new Id(123, "abc"), new User());
		System.out.println(m.get(new Id(123, "abc")));
	}
}

class Id {

	final long id;
	final String strId;

	public Id(long id, String strId) {
		super();
		this.id = id;
		this.strId = strId;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + (int) (id ^ (id >>> 32));
//		result = prime * result + ((strId == null) ? 0 : strId.hashCode());
//		return result;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Id other = (Id) obj;
		if (id != other.id)
			return false;
		if (strId == null) {
			if (other.strId != null)
				return false;
		} else if (!strId.equals(other.strId))
			return false;
		return true;
	}

}

class User {
}