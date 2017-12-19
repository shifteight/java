import java.awt.*;
import javax.swing.*;

public class JTextComponentDemo extends JFrame
{
	private JTextField username;
	private JPasswordField password;
	private JButton login, cancel;

	public JTextComponentDemo (String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();

		username = new JTextField(10);
		password = new JPasswordField(10);

		login = new JButton("Login");
		cancel = new JButton("Cancel");

		//layout the GUI
		JPanel grid = new JPanel(new GridLayout(2,2));

		JLabel usrLabel = new JLabel("Username:", SwingConstants.RIGHT);
		grid.add(usrLabel);

		JPanel two = new JPanel(new FlowLayout(FlowLayout.LEFT));
		two.add(username);
		grid.add(two);

		JLabel pwdLabel = new JLabel("Password:", SwingConstants.RIGHT);
		grid.add(pwdLabel);

		JPanel four = new JPanel(new FlowLayout(FlowLayout.LEFT));
		four.add(password);
		grid.add(four);

		contentPane.add(grid, BorderLayout.CENTER);

		JPanel south = new JPanel();
		south.add(login);
		south.add(cancel);
		contentPane.add(south, BorderLayout.SOUTH);

		this.setSize(250, 125);
		this.setResizable(false);
	}

	public static void main(String [] args)
	{
		JTextComponentDemo f = new JTextComponentDemo ("JTextComponentDemo ");
		f.setVisible(true);
	}
}