package alias;

public class Example {

	public static void main(String[] args) {
		Condition condition = new Condition();
		condition.setUserName("��");
		condition.setAge(25);
		
		UserDao dao = new UserDao();
		// �����ڼ䣬���Է���ֵ
		dao.query(condition);
		
		// �ڶ���ʹ��
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