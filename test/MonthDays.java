public class MonthDays 
{
	public static boolean leapYear(int year)
	{
		return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
	}

	public static void main(String[] args) 
	{
		final int THISYEAR = 2008;
		int daysInMonth = 0;
		int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

		System.out.println("In year " + THISYEAR + ":");

		for(int month : months)
		{
			switch (month)
			{
			case 9: case 4: case 6: case 11:
				daysInMonth = 30; break;
			case 1: case 3: case 5: case 7:
			case 8: case 10: case 12:
				daysInMonth = 31; break;
			case 2:
				if(leapYear(THISYEAR))
				{
					daysInMonth = 29;
				}
				else 
				{
					daysInMonth = 28;
				}
				break;
			default:
				System.out.println("Incorrect value for month.");
			}
			
			System.out.println("Month " + month + " has " 
				+ daysInMonth + " days.");
		}
	}
}
