package ch01.sec01;

import java.util.Random;

public class LoopDemo {
	public static void main(String[] args) {
		Random generator = new Random();
		int sum = 0;
		int count = 0;
		int target = 100;
		while (sum < target) {
			int next = generator.nextInt(10);
			sum += next;
			count++;
		}
		System.out.printf("You took %d times to get %d\n.", count, sum);
	}
}