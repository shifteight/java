import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class SendMessage implements ActionListener
{
	private JTextArea textArea;
	private String recipient, sender;
	private JDialog dialog;
	private ObjectOutputStream out;

	public SendMessage(JTextArea t, String r, String s, JDialog d, OutputStream dest) throws IOException
	{
		textArea = t;
		recipient = r;
		sender = s;
		dialog = d;
		out = new ObjectOutputStream(dest);
	}

	public void actionPerformed(ActionEvent a)
	{
		String label = a.getActionCommand();
		if(label.equals("Send"))
		{
			String message = textArea.getText();
			InstantMessage im = new InstantMessage(recipient, sender, message);
			try
			{
				out.writeObject(im);
			}catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			dialog.hide();
		}
		else if(label.equals("Cancel"))
		{
			dialog.hide();
		}
	}
}