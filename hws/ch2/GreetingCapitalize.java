import java.util.Scanner;

public class GreetingCapitalize {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String name;
		System.out.print("Enter your name: ");
		name = stdin.nextLine().toUpperCase();
		System.out.println("Hello, " + name + ", nice to meet you!");
	}
}