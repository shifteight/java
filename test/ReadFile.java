import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Please enter one file name!");
			System.exit(0);
		}
		
		File f = new File(args[0]);
		
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null) {
				System.out.println("Read line: " + s);
				s = br.readLine();
			}
			br.close();
		} catch(FileNotFoundException e1) {
			System.err.println("File not found: " + args[0]);
		} catch(IOException e2) {
			e2.printStackTrace();
		}
	}
}