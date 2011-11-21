package exception.runtime;

/*~
 * 继承自RuntimeException，具有“不声明即可抛出”的能力
 */
public class DatasourceException extends RuntimeException {

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
