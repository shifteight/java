import java.awt.*;
import javax.swing.*;

public class InstantMessageFrame extends JFrame
{
	private JList friends;
	private JTextField message;
	private JButton send;

	public InstantMessageFrame(String title, String sender)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JPanel south = getMessagePanel();
		JScrollPane center = getFriendsPane();

		Container contentPane = this.getContentPane();
		contentPane.add(south, BorderLayout.SOUTH);
		contentPane.add(center, BorderLayout.CENTER);

		IMHandler imHandler = new IMHandler(message, friends);
		message.addActionListener(imHandler);
		send.addActionListener(imHandler);

		friends.addMouseListener(new DisplayMessageDialog(sender));

		String [] names = {"Jay", "Marie", "Melissa", "Mark", "Margaret"};
		friends.setListData(names);
	}

	private JPanel getMessagePanel()
	{
		JPanel panel = new JPanel(new BorderLayout());
		message = new JTextField();
		send = new JButton("Send");

		panel.add(message, BorderLayout.CENTER);
		panel.add(send, BorderLayout.EAST);

		return panel;
	}

	private JScrollPane getFriendsPane()
	{
		friends = new JList();
		JScrollPane pane = new JScrollPane(friends);
		return pane;
	}

	public static void main(String [] args)
	{
		JFrame f = new InstantMessageFrame("My IM Program", args[0]);
		f.setSize(220,450);
		f.setVisible(true);
	}
}