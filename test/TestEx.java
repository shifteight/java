public class TestEx
{
	public static void main(String[] args) {
		try
		{
			System.out.println(1/0);
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
	}
}