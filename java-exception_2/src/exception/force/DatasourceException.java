package exception.force;

/**
 * ���ݿ��쳣
 * @author shenfeng
 *
 */
/*~
 * �̳����쳣�ĸ���Exception������ζ���µ���Ҳ�����ܱ����׳���������
 * һ���쳣�ڲ�û��ʲô�����߼�����һ���õ���������ؼ��ġ�
 */
public class DatasourceException extends Exception {

	// �ṩ�˺ܶ�Ĺ�����������ʹ��
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
