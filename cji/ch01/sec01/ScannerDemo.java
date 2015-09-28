package ch01.sec01;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("Hello, " + name);
	}
}