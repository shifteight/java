import java.awt.*;

public class ChoiceDemo extends Frame
{
	private Choice items;
	private Label selected;

	public ChoiceDemo(String title)
	{
		super(title);

		items = new Choice();
		items.add("");
		items.add("Sunday");
		items.add("Monday");
		items.add("Tuesday");
		items.add("Wednesday");
		items.add("Thursday");
		items.add("Friday");
		items.add("Saturday");

		selected = new Label("Select a day", Label.CENTER);

		this.setLayout(new BorderLayout(10, 0));
		this.add(selected, BorderLayout.NORTH);
		this.add(items, BorderLayout.CENTER);

		ShowChoice listener = new ShowChoice(selected);
		items.addItemListener(listener);
	}

	public static void main(String [] args)
	{
		ChoiceDemo f = new ChoiceDemo("ChoiceDemo");
		f.setSize(200,100);
		f.setVisible(true);
	}
}