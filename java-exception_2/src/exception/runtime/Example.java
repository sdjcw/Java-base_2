package exception.runtime;

public class Example {

	public static void main(String[] args) {
		DataAccessObject dao = new DataAccessObject();
		/*~
		 * 下面的语句会抛出异常，但因为是RuntimeException，并不强制捕获或声明抛出
		 * 因为没有捕获，异常自动抛出，抛到了控制台
		 */
		dao.getUser(10);
	}

}
