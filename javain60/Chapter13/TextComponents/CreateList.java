import java.awt.*;
import java.awt.event.*;

public class CreateList implements ActionListener
{
	private int counter;
	private TextField source;
	private TextArea destination;

	public CreateList(TextField s, TextArea d)
	{
		source = s;
		destination = d;
	}

	public void actionPerformed(ActionEvent e)
	{
		Object component = e.getSource();
		String action = e.getActionCommand();

		if(component instanceof TextField || action.equals("Enter"))
		{
			String text = source.getText();
			counter++;
			destination.append(counter + ". " + text + "\n");
			source.setText("");
		}
		else if(action.equals("Clear"))
		{
			destination.setText("");
			counter = 0;
		}
	}
}