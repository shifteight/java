import java.awt.*;

public class EventDemo2 extends Frame
{
	private Button go;

	public EventDemo2(String title)
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

		//register a listener to this Frame
		SimpleWindowCloser closer = new SimpleWindowCloser();
		this.addWindowListener(closer);
	}

	public static void main(String [] args)
	{
		Frame f = new EventDemo2("SimpleWindowCloser");
		f.setSize(300,300);
		f.setVisible(true);
	}
}