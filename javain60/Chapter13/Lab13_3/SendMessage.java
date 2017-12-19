import javax.swing.*;
import java.awt.event.*;

public class SendMessage implements ActionListener
{
	private JTextArea textArea;
	private String recipient;
	private JDialog dialog;

	public SendMessage(JTextArea t, String r, JDialog d)
	{
		textArea = t;
		recipient = r;
		dialog = d;
	}

	public void actionPerformed(ActionEvent a)
	{
		String label = a.getActionCommand();
		if(label.equals("Send"))
		{
			String message = textArea.getText();
			System.out.println(recipient + ": " + message);
			dialog.hide();
		}
		else if(label.equals("Cancel"))
		{
			dialog.hide();
		}
	}
}