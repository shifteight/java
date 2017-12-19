import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo extends JFrame
{
	JTextArea textArea;

	public ScrollPaneDemo(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = this.getContentPane();

		textArea = new JTextArea();
		JScrollPane pane = new JScrollPane(textArea,
					ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		contentPane.add(pane, BorderLayout.CENTER);
	}

	public static void main(String [] args)
	{
		JFrame f = new ScrollPaneDemo("ScrollPaneDemo");
		f.setSize(300,200);
		f.setVisible(true);
	}
}