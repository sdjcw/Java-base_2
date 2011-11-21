package iostream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;

public class Example {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader( //
				new FileReader("src/iostream/IoStreamExample.java"));

		StringBuilder source = new StringBuilder();
		String tmp;
		while ((tmp = in.readLine()) != null) {
			source.append(tmp).append("\n");
		}
		System.out.println("******************输出源代码******************");
		System.out.println(source.toString());
		System.out.println("******************输出源代码******************");

		System.out.println("源码输出到文件");
		BufferedReader in2 = new BufferedReader(new StringReader(source.toString()));
		PrintWriter out1 = new PrintWriter(
				new BufferedWriter(new FileWriter("src/iostream/IoStreamExample.out")));
		int lineCount = 1;
		while((tmp = in2.readLine()) != null )
			out1.println(lineCount++ + ": " + tmp);
		out1.close();

		System.out.println("控制台输入输出");
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.print("请输入：");
		System.out.println(stdin.readLine());

		BufferedInputStream in3 = new BufferedInputStream( //
				new FileInputStream("bin/iostream/IoStreamExample.class"));
		BufferedOutputStream out3 = new BufferedOutputStream( //
				new FileOutputStream("bin/iostream/IoStreamExample.class.out"));
		byte[] bs = new byte[2048];
		int read = -1;
		while ((read = in3.read(bs)) != -1) {
			out3.write(bs, 0, read);
		}
		in3.close();
		out3.close();
	}
}
