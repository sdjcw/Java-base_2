package alias;

public class UserDao {

	public void query(Condition condition) {
		System.out.println("Condition: userName=" + condition.getUserName()
				+ ", age=" + condition.getAge());
		
		// 也许为了方便，并没有创建新的对象
		condition.setUserName("李");
		// 使用condition
		// fun(condition);....
	}

}
