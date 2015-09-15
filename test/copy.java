import java.io.*;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("TestFileOutputStream.java");
            out = new FileOutputStream("copy.java");
            while((b=in.read()) != -1) {
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(-1);
        } catch (IOException e) {
            System.out.println("File copy error!");
            System.exit(-1);
        }
        System.out.println("File copied!");
    }
}
