import java.awt.*;

public class RadioButtonDemo extends Frame
{
	private Checkbox small, medium, large;
	private Button button;

	public RadioButtonDemo(String title)
	{
		super(title);

		CheckboxGroup group = new CheckboxGroup();

		small = new Checkbox("small", group, false);
		medium = new Checkbox("medium", group, true);
		large = new Checkbox("large", group, false);

		button = new Button("Click here");
		button.setBounds(100,50,100, 50);
		Panel center = new Panel();
		center.setLayout(null);
		center.add(button);
		this.add(center, BorderLayout.CENTER);

		//add the radio buttons to the frame
		Panel north = new Panel();
		north.add(small);
		north.add(medium);
		north.add(large);

		this.add(north, BorderLayout.NORTH);

		//register the event listener
		ChangeSize listener = new ChangeSize(button);
		small.addItemListener(listener);
		medium.addItemListener(listener);
		large.addItemListener(listener);
	}

	public static void main(String [] args)
	{
		Frame f = new RadioButtonDemo("RadioButtonDemo");
		f.setSize(300,200);
		f.setVisible(true);
	}
}