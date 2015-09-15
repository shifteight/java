import java.io.*;
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("unicode.dat");
            for(int c=0; c<=50000; c++) {
                fw.write(c);
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File write error!");
            System.exit(-1);
        }
    }
}
