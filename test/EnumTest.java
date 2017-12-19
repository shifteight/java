public class EnumTest {
	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
		THURSDAY, FRIDAY, SATURDAY 
	} // 定义枚举类型Day <事实上定义了一个类Day>
		
	Day day; // 声明一个Day型变量
	
	public EnumTest(Day day) {
		this.day = day;
	} // 构造函数
	
	public void tellItLikeItIs() {
		switch (day) {
			case MONDAY: System.out.println("Mondays are bad.");
					     break;
					
			case FRIDAY: System.out.println("Fridays are better.");
					     break;
					     
			case SATURDAY:
			case SUNDAY: System.out.println("Weekends are best.");
					     break;
					     
			default:	 System.out.println("Midweek days are so-so.");
					     break;
		}
	}
	
	public static void main(String[] args) {
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
		
		
	}
}

