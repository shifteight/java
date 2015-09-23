public class AverageGrade {

	public static void main(String[] args) {

		String name;
		int ex1, ex2, ex3;
		double average;

		TextIO.readFile("testdata.txt");
		name = TextIO.getln();
		ex1 = TextIO.getlnInt();
		ex2 = TextIO.getlnInt();
		ex3 = TextIO.getlnInt();

		average = (ex1 + ex2 + ex3) / 3.0;

		System.out.printf("Name: %s, Average Grade: %.2f%n", name, average);
	}
}