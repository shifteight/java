import java.awt.event.*;

public class SimpleWindowCloser extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}