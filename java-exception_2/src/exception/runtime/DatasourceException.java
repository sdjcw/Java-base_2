package exception.runtime;

/*~
 * �̳���RuntimeException�����С������������׳���������
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
