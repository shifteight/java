package ch01.sec01;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> friends = new ArrayList<>();
		
		friends.add("Peter");
		friends.add("Paul");

		friends.remove(1);

		friends.add(0, "Paul");  // Adds before index 0

		System.out.println("I have friends:");
		for (String name : friends) {
			System.out.println("- " + name);
		}

		String first = friends.get(0);
		System.out.println("The first friend is " + first);

		friends.set(1, "Mary");
		System.out.println("The second friend was changed to "
						   + friends.get(1));
	}
}