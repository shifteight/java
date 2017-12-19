import java.awt.*;

public class ListDemo extends Frame
{
	private List items;
	private Label selected;

	public ListDemo (String title)
	{
		super(title);

		items = new List();
		items.add("Sunday");
		items.add("Monday");
		items.add("Tuesday");
		items.add("Wednesday");
		items.add("Thursday");
		items.add("Friday");
		items.add("Saturday");

		selected = new Label("Double-click a day", Label.CENTER);

		this.setLayout(new BorderLayout(10, 0));
		this.add(selected, BorderLayout.NORTH);
		this.add(items, BorderLayout.CENTER);

		ShowSelection listener = new ShowSelection(selected); // create a listener object
		items.addActionListener(listener); // register the listener
	}

	public static void main(String [] args)
	{
		ListDemo f = new ListDemo("ListDemo");
		f.setSize(150,150);
		f.setVisible(true);
	}
}