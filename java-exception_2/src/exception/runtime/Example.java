package exception.runtime;

public class Example {

	public static void main(String[] args) {
		DataAccessObject dao = new DataAccessObject();
		/*~
		 * ����������׳��쳣������Ϊ��RuntimeException������ǿ�Ʋ���������׳�
		 * ��Ϊû�в����쳣�Զ��׳����׵��˿���̨
		 */
		dao.getUser(10);
	}

}
