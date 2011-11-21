package alias;

public class Example {

	public static void main(String[] args) {
		Condition condition = new Condition();
		condition.setUserName("张");
		condition.setAge(25);
		
		UserDao dao = new UserDao();
		// 简略期间，忽略返回值
		dao.query(condition);
		
		// 第二次使用
		dao.query(condition);
	}
}

class Condition {

	private String userName;

	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}