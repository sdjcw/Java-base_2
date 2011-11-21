package exception.force;

public class Example {

	public static void main(String[] args) throws Exception {
		DataAccessObject dao = new DataAccessObject();

		/*~
		 * main������������쳣�Ļ��ᣬ�����ʱ�ٲ������쳣���������쳣�������׳���
		 * �����ǵĳ���ᱻ��ֹ�����ڿ���̨����쳣��ջ��Ϣ
		 */
		// dao.getuser(-1);

		/*~
		 * ��Ϊdao.getUser()���ܻ��׳��쳣��������Ҫ���Ǵ���ʹ��try����ס���ܳ�������Ĵ���
		 */
		try {
			// ���������һ��OK��
			User user = dao.getUser(1);
			System.out.println("��ѯ���: userId = " + user.getId() //
					+ ", name = " + user.getName());

			// ����Ĵ�������ArgumentException�쳣
			dao.getUser(-1);
			System.out.println("��Ϊ����Ĵ��������쳣������������ת�������������ֲ��ᱻ��ӡ");
		}
		/*~
		 * ʹ��catch�������try����棬���ҿ��Ը����catch�飬ÿ������Ҫ����һ���쳣���ͣ�
		 * �����������catch���ǲ����������͵��쳣����
		 * ��try������ĳ����쳣������ʽ���£�
		 * 1�����������ɡ��쳣������ϵ���ӹܣ�ֱ����ת��tryĩβ����ʼ���ϵ�������ƥ��catch��
		 * 2�����쳣��������catch����������һ��ʱ����ִ�и�catch���ڲ��Ĵ���
		 * 3��ִ����Ϻ�Java����Ϊ�쳣�Ѿ��������ҵõ�����ȷ�Ĵ���
		 * 4���������̽������������̣���catch�����Ĵ��뿪ʼִ��
		 */
		catch (ArgumentException e) {
			System.out.println("������Ĳ������Ϸ�����ȷ�Ϻ����ԣ�лл��");
		} catch (DatasourceException e) {
			// ������ñ��������������Ծ����ԣ�˳������DBA
			alarm(e);

			// �����˸��û�һ���ѺõĻظ�
			System.out.println("�Բ���ϵͳ�ڲ������쳣���������ڽ�������");
		} catch (NetworkException e) {
			// �������������洦��ʽ���ƣ�������·����˳�����������Ա
			alarm(e);

			System.out.println("�Բ���ϵͳ�ڲ������쳣���������ڽ�������");
		}

		System.out.println("\n���ݿ��쳣����ʹ���ʾ��...");
		try {
			// ����Ĵ�������DatasourceException�쳣
			dao.getUser(10);
		} catch (ArgumentException e) {
			System.out.println("������Ĳ������Ϸ�����ȷ�Ϻ����ԣ�лл��");
		} catch (DatasourceException e) {
			alarm(e);
			System.out.println("�Բ���ϵͳ�ڲ������쳣���������ڽ�������");
		} catch (NetworkException e) {
			alarm(e);
			System.out.println("�Բ���ϵͳ�ڲ������쳣���������ڽ�������");
		} catch (Exception e) {
			/*~
			 * ����Exception���͵��쳣���Բ������е��쳣��һ����������һ�����մ�ʩ
			 */
			alarm(e);
		}

		/*~
		 * �쳣��������󣬳������ָ̻���������catch���ʼִ��
		 */
		System.out.println("\nϵͳ�����˳�");
	}

	public static void alarm(Exception e) {
		// �����Ǳ�������������쳣��������ɵ����ó�
		System.out.println("�ڲ���־��������������������" + e.getMessage());
	}

}
