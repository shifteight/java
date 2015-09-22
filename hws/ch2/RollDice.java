public class RollDice {

	public static void main(String[] args) {

		int first, second, total;
		first = (int)(Math.random() * 6) + 1;
		second = (int)(Math.random() * 6) + 1;
		total = first + second;
		System.out.printf("The first die comes up %d%n", first);
		System.out.printf("The second die comes up %d%n", second);
		System.out.printf("Your total roll is %d%n", total);
	}
}