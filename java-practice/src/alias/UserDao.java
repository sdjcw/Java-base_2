package alias;

public class UserDao {

	public void query(Condition condition) {
		System.out.println("Condition: userName=" + condition.getUserName()
				+ ", age=" + condition.getAge());
		
		// Ҳ��Ϊ�˷��㣬��û�д����µĶ���
		condition.setUserName("��");
		// ʹ��condition
		// fun(condition);....
	}

}
