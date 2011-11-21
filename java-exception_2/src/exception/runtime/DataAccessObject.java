package exception.runtime;

public class DataAccessObject {

	/*~
	 * IllegalArgumentException和DatasourceException都继承自RuntimeException，所以方法后面
	 * 可以没有异常声明，及时有异常声明，也不强制调用者捕获处理或再抛出
	 */
	public User getUser(long userId) {
		if (userId <= 0) {
			throw new IllegalArgumentException("userId不合法");
		}

		// 为了方便演示，在此根据传入的ID不同多抛出几种不同类型的异常
		if (userId == 10) {
			throw new DatasourceException("数据库出现异常");
		}

		// 获取User对象的过程，为了方便演示，直接创建一个对象
		User user = new User(userId, "张三");

		return user;
	}

}
