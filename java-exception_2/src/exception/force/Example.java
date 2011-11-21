package exception.force;

public class Example {

	public static void main(String[] args) throws Exception {
		DataAccessObject dao = new DataAccessObject();

		/*~
		 * main方法是最后处理异常的机会，如果此时再不处理异常，或者有异常产生并抛出，
		 * 则我们的程序会被终止，并在控制台输出异常退栈信息
		 */
		// dao.getuser(-1);

		/*~
		 * 因为dao.getUser()可能会抛出异常，所以需要我们处理，使用try块扩住可能出现问题的代码
		 */
		try {
			// 正常情况，一切OK！
			User user = dao.getUser(1);
			System.out.println("查询结果: userId = " + user.getId() //
					+ ", name = " + user.getName());

			// 下面的代码会出现ArgumentException异常
			dao.getUser(-1);
			System.out.println("因为上面的代码会出现异常，程序流程跳转，所以这行文字不会被打印");
		}
		/*~
		 * 使用catch块紧跟在try块后面，并且可以跟多个catch块，每个块需要附加一个异常类型，
		 * 表明“我这个catch块是捕获这种类型的异常”。
		 * 当try块中真的出现异常，处理方式如下：
		 * 1、程序流程由“异常处理体系”接管，直接跳转到try末尾，开始从上到下依次匹配catch块
		 * 2、当异常的类型与catch块中声明的一致时，则执行该catch块内部的代码
		 * 3、执行完毕后Java就认为异常已经被捕获，且得到了正确的处理
		 * 4、程序流程交还给正常流程，从catch块后面的代码开始执行
		 */
		catch (ArgumentException e) {
			System.out.println("您传入的参数不合法，请确认后重试，谢谢！");
		} catch (DatasourceException e) {
			// 在这里该报警报警，该重试就重试，顺便找下DBA
			alarm(e);

			// 别忘了给用户一个友好的回复
			System.out.println("对不起，系统内部出现异常，我们正在紧急处理！");
		} catch (NetworkException e) {
			// 这里的问题和上面处理方式类似，不过网路问题顺便找网络管理员
			alarm(e);

			System.out.println("对不起，系统内部出现异常，我们正在紧急处理！");
		}

		System.out.println("\n数据库异常捕获和处理示例...");
		try {
			// 下面的代码会出现DatasourceException异常
			dao.getUser(10);
		} catch (ArgumentException e) {
			System.out.println("您传入的参数不合法，请确认后重试，谢谢！");
		} catch (DatasourceException e) {
			alarm(e);
			System.out.println("对不起，系统内部出现异常，我们正在紧急处理！");
		} catch (NetworkException e) {
			alarm(e);
			System.out.println("对不起，系统内部出现异常，我们正在紧急处理！");
		} catch (Exception e) {
			/*~
			 * 捕获Exception类型的异常可以捕获所有的异常，一般放在最后做一个保险措施
			 */
			alarm(e);
		}

		/*~
		 * 异常被捕获处理后，程序流程恢复正常，从catch块后开始执行
		 */
		System.out.println("\n系统正常退出");
	}

	public static void alarm(Exception e) {
		// 这里是报警处理，传入的异常对象可能派得上用场
		System.out.println("内部日志：警报！！警报！！！" + e.getMessage());
	}

}
