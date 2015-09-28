package ch01.sec01;

public class VarArgsDemo {
	
	public static double average(double... values) {
		double sum = 0;
		for (double v : values)
			sum += v;
		return values.length == 0 ? 0 : sum / values.length;
	}

	public static void main(String[] args) {
		
		double avg = average(3, 4.5, 10, 0);
		System.out.println("average = " + avg);
		
	}
}