package exception.force;

/**
 * 数据库异常
 * @author shenfeng
 *
 */
/*~
 * 继承了异常的父类Exception，就意味着新的类也具有能被“抛出”的能力
 * 一般异常内部没有什么特殊逻辑，起一个好的名字是最关键的。
 */
public class DatasourceException extends Exception {

	// 提供了很多的构造器，方便使用
	public DatasourceException() {
		super();
	}

	public DatasourceException(String message, Throwable cause) {
		super(message, cause);
	}

	public DatasourceException(String message) {
		super(message);
	}

	public DatasourceException(Throwable cause) {
		super(cause);
	}

}
