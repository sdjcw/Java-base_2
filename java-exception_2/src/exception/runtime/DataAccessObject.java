package exception.runtime;

public class DataAccessObject {

	/*~
	 * IllegalArgumentException��DatasourceException���̳���RuntimeException�����Է�������
	 * ����û���쳣��������ʱ���쳣������Ҳ��ǿ�Ƶ����߲���������׳�
	 */
	public User getUser(long userId) {
		if (userId <= 0) {
			throw new IllegalArgumentException("userId���Ϸ�");
		}

		// Ϊ�˷�����ʾ���ڴ˸��ݴ����ID��ͬ���׳����ֲ�ͬ���͵��쳣
		if (userId == 10) {
			throw new DatasourceException("���ݿ�����쳣");
		}

		// ��ȡUser����Ĺ��̣�Ϊ�˷�����ʾ��ֱ�Ӵ���һ������
		User user = new User(userId, "����");

		return user;
	}

}
