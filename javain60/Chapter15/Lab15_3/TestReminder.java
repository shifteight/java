import java.util.*;

public class TestReminder
{
	public static void main(String [] args)
	{
		Timer timer = new Timer();
		Reminder meeting = new Reminder("Meeting with Ann");
		Reminder dentist = new Reminder("Dr. Moler, cavity filled");
		Reminder date = new Reminder("Dinner with Matt and Ann");

		timer.schedule(meeting, 0);
		timer.schedule(dentist, 30000);
		timer.schedule(date, 120000);
	}
}