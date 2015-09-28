package ch01.sec01;

import java.io.Console;

public class ConsoleDemo {
	public static void main(String[] args) {
		Console terminal = System.console();
		String username = terminal.readLine("User name: ");
		char[] passwd = terminal.readPassword("Password: ");
		System.out.println("Hello, " + username);
		if (passwd.length > 0) {
			System.out.println("Your password is set.");
		} else {
			System.out.println("WARNNING: empty password!!!");
		}
	}
}