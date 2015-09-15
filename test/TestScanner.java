import java.util.Scanner;
import java.io.*;

public class TestScanner {
    public static void main(String[] args) {
        String fname, lname;
        int age;
        Scanner fileInput;
        File inFile = new File("ages.dat");

        try {
            fileInput = new Scanner(inFile);

            while(fileInput.hasNext()) {
                fname = fileInput.next();
                lname = fileInput.next();
                age = fileInput.nextInt();
                System.out.printf("%s %s is %d years old.\n", fname, lname, age);
            }

            fileInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
