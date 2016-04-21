public class BitTest
{
	public static void main(String[] args) {
		int n = 120;
		int fourthBitFromRight = (n & 0b1000) / 0b1000;
		System.out.println(fourthBitFromRight);
	}
}
