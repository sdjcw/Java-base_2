package exception.force;

public class DataAccessObject {

	/*~
	 * 因为该方法"可能"会抛出异常，意味着需要告诉调用它的人“我有可能抛出异常，你要时刻准备着处理”
	 * 所以抛出异常的声明是方法定义的一部分，跟在返回值后，使用throws关键字，后面跟上可能抛出的
	 * 异常类型。throws是复数形式，意味着可以跟多个，使用逗号隔开。
	 * 因为方法可能抛出多种异常，所有的异常都必须在方法上声明
	 */
	public User getUser(long userId) throws ArgumentException, DatasourceException,
	NetworkException {
		if (userId <= 0) {
			/*~
			 * 如果传入的参数不合法，后面的操作不需要再做了，但直接返回null又不合适，
			 * 因为请求的调用者通过返回的null不能了解出现了什么问题，甚至还会以为是DAO出了
			 * 问题或者没有相关数据...
			 */
			// return null;

			/*~
			 * 那返回-1或者-3这样的识别码？不行，因为该方法的返回值已经确定是一个User的对象
			 */
			// return -1;

			/*~
			 * 那如何表明这个不合法的状况呢？人为产生一个异常，并抛出给调用者（调用者是上层环境）
			 *
			 * 产生异常：异常也是对象，直接使用new来创建，Exception是异常的父类，可以通过
			 * 一个异常描述信息来创建一个异常，方便异常处理时使用。
			 *
			 * 抛出异常：使用throw关键字，后面跟一个异常对象。一旦异常被抛出，程序流程由“异常处
			 * 理体系”控制，在此处方法将会直接结束，上层环境会得到一个异常对象。
			 */
			throw new ArgumentException("userId不合法");
		}

		// 为了方便演示，在此根据传入的ID不同多抛出几种不同类型的异常
		if (userId == 10) {
			throw new DatasourceException("数据库出现异常");
		}
		if (userId == 100) {
			throw new NetworkException("网络出现异常");
		}

		// 获取User对象的过程，为了方便演示，直接创建一个对象
		User user = new User(userId, "张三");

		return user;
	}

}
