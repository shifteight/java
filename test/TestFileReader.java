import java.io.*;
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c = 0;
        try {
            fr = new FileReader("test.txt");
            while ((c=fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File read error!");
        }
    }
}
