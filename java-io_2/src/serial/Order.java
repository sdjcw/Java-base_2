package serial;

import java.io.Serializable;

public class Order implements Serializable {

	private long id;
	private User user;
	private Item item;

	public Order(long id, User user, Item item) {
		this.id = id;
		this.user = user;
		this.item = item;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
