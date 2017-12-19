import java.awt.*;

public class CheckboxDemo extends Frame
{
	private Checkbox red, yellow, blue;

	public CheckboxDemo(String title)
	{
		super(title);

		red = new Checkbox("Red");
		blue = new Checkbox("Blue");
		yellow = new Checkbox("Yellow");

		//add the checkboxes to the frame
		Panel north = new Panel();
		north.add(red);
		north.add(blue);
		north.add(yellow);

		this.add(north, BorderLayout.NORTH);

		//register the event listener
		MixColors listener = new MixColors(this);
		red.addItemListener(listener);
		blue.addItemListener(listener);
		yellow.addItemListener(listener);
	}

	public static void main(String [] args)
	{
		Frame f = new CheckboxDemo("CheckboxDemo");
		f.setSize(300,300);
		f.setVisible(true);
	}
}