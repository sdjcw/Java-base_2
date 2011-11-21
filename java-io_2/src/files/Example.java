package files;

import java.io.File;
import java.io.IOException;

public class Example {

	public static void main(String[] args) throws IOException {
		System.out.println("关于testFile.txt文件的操作...");
		File file = new File("testFile.txt");

		System.out.println("如果存在则删除...");
		file.deleteOnExit();

		System.out.println("是否存在：" + file.exists());
		System.out.println("创建新文件是否成功：" + file.createNewFile());
		System.out.println("是否存在：" + file.exists());

		System.out.println("绝对路径：" + file.getAbsolutePath());
		System.out.println("是否是文件：" + file.isFile());
		System.out.println("是否是文件夹：" + file.isDirectory());

		System.out.println("是否可读：" + file.canRead());
		System.out.println("是否可写：" + file.canWrite());
		System.out.println("是否可执行：" + file.canExecute());

		File file2 = new File("testFile2.txt");
		System.out.println("重命名是否成功：" + file.renameTo(file2));

		System.out.println("删除文件是否成功：" + file2.delete());

		System.out.println("\n文件夹相关操作：");
		File dir = new File(".");
		System.out.println("文件夹：" + dir.getCanonicalPath());
		String[] fileList = dir.list();
		for (String fileName : fileList) {
			System.out.println("  " + fileName);
		}
	}

}
