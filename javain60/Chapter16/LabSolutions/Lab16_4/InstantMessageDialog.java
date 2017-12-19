import java.awt.*;
import javax.swing.*;
import java.io.*;

public class InstantMessageDialog extends JDialog
{
	private JButton send, cancel;
	private JTextArea message;

	public InstantMessageDialog(Frame owner, String recipient, String sender) throws IOException
	{
		super(owner, "SendMessage Dialog", true);

		Container contentPane = this.getContentPane();

		send = new JButton("Send");
		cancel = new JButton("Cancel");
		message = new JTextArea();

		JPanel south = new JPanel();
		south.add(send);
		south.add(cancel);
		contentPane.add(south, BorderLayout.SOUTH);

		JScrollPane center = new JScrollPane(message);
		contentPane.add(center, BorderLayout.CENTER);

		JLabel north = new JLabel("Sending message to " + recipient);
		contentPane.add(north, BorderLayout.NORTH);

		this.setSize(400,200);

		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream(in);

		SendMessage listener = new SendMessage(message, recipient, sender, this, out);
		send.addActionListener(listener);
		cancel.addActionListener(listener);

		Participant user = new Participant(recipient, in);
		user.start();
	}

	public static void main(String [] args)
	{
		try
		{
			InstantMessageDialog d = new InstantMessageDialog(null, args[0], args[1]);
			d.show();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}