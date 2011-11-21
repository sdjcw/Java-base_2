package files;

import java.io.File;
import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {
		System.out.println("����testFile.txt�ļ��Ĳ���...");
		File file = new File("testFile.txt");

		System.out.println("���������ɾ��...");
		file.deleteOnExit();

		System.out.println("�Ƿ���ڣ�" + file.exists());
		System.out.println("�������ļ��Ƿ�ɹ���" + file.createNewFile());
		System.out.println("�Ƿ���ڣ�" + file.exists());

		System.out.println("����·����" + file.getAbsolutePath());
		System.out.println("�Ƿ����ļ���" + file.isFile());
		System.out.println("�Ƿ����ļ��У�" + file.isDirectory());

		System.out.println("�Ƿ�ɶ���" + file.canRead());
		System.out.println("�Ƿ��д��" + file.canWrite());
		System.out.println("�Ƿ��ִ�У�" + file.canExecute());

		File file2 = new File("testFile2.txt");
		System.out.println("�������Ƿ�ɹ���" + file.renameTo(file2));

		System.out.println("ɾ���ļ��Ƿ�ɹ���" + file2.delete());

		System.out.println("\n�ļ�����ز�����");
		File dir = new File(".");
		System.out.println("�ļ��У�" + dir.getCanonicalPath());
		String[] fileList = dir.list();
		for (String fileName : fileList) {
			System.out.println("  " + fileName);
		}
	}

}
