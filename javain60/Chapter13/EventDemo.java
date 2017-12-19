import java.awt.*;

public class EventDemo extends Frame
{
	private Button go;

	public EventDemo(String title)
	{
		super(title);

		go = new Button("Go");

		//instantiate a listener object
		RandomColor changer = new RandomColor(this);

		//register the listener with the button
		go.addActionListener(changer);

		//add the button to the frame
		this.setLayout(new FlowLayout());
		this.add(go);
	}

	public static void main(String [] args)
	{
		Frame f = new EventDemo("Click the button...");
		f.setSize(300,300);
		f.setVisible(true);
	}
}