import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TestStandardInput {
	public static void main(String[] args) {
		String s;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("输入'exit'退出程序");
		try {
			s = br.readLine();
			while(!s.equals("exit")) {
				System.out.println("Read line: " + s);
				s = br.readLine();
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
