import java.awt.*;
import javax.swing.*;

public class SelectionDialog extends JDialog
{
	private JList left, right;
	private JComboBox direction;
	private JLabel display;

	public SelectionDialog(String title)
	{
		this.setTitle(title);
		Container contentPane = this.getContentPane();

		String [] comboBoxItems = {"Right", "Left"}; // create an array as JCombxBox parameter
		direction = new JComboBox(comboBoxItems);

		String [] listItems = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		left = new JList(listItems);
		right = new JList();
		left.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		right.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		display = new JLabel("Right", SwingConstants.CENTER);

		contentPane.add(display, BorderLayout.NORTH);

		JPanel center = new JPanel(new GridLayout(1,2));
		JScrollPane leftPane = new JScrollPane(left, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		center.add(leftPane);
		JScrollPane rightPane = new JScrollPane(right, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		center.add(rightPane);
		contentPane.add(center, BorderLayout.CENTER);

		JPanel south = new JPanel();
		south.add(direction);
		contentPane.add(south, BorderLayout.SOUTH);

		SelectionHandler handler = new SelectionHandler(display, left, right);
		direction.addActionListener(handler);
		left.addListSelectionListener(handler);
		right.addListSelectionListener(handler);
	}

	public static void main(String [] args)
	{
		SelectionDialog d = new SelectionDialog("SelectionDialog");
		d.setSize(200,200);
		d.setVisible(true);
	}
}