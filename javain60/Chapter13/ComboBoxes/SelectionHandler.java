import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Vector;

public class SelectionHandler implements ActionListener, ListSelectionListener
{
	private JLabel direction;
	private JList source, destination;

	public SelectionHandler(JLabel d, JList left, JList right)
	{
		direction = d;
		source = left;
		destination = right;
	}

	public void actionPerformed(ActionEvent a)
	{
		JComboBox cb = (JComboBox) a.getSource();
		String selected = (String) cb.getSelectedItem();
		String current = direction.getText();
		if(!selected.equals(current))
		{
			direction.setText(selected);
			JList temp = source;
			source = destination;
			destination = temp;
			source.clearSelection();
			destination.clearSelection();
		}
		//else do nothing
	}

	public void valueChanged(ListSelectionEvent e)
	{
		JList list = (JList) e.getSource();
		String item = (String) source.getSelectedValue();
		System.out.println(item);
		if(item != null && !item.equals(""))
		{
			removeFromSource(item);
			addToDestination(item);
		}
	}

	private void removeFromSource(String item)
	{
		ListModel model = source.getModel();
		Vector listData = new Vector();
		for(int i = 0; i < model.getSize(); i++)
		{
			listData.addElement(model.getElementAt(i));
		}

		listData.removeElement(item);
		source.setListData(listData);
	}

	private void addToDestination(String item)
	{
		ListModel model = destination.getModel();
		Vector listData = new Vector();
		for(int i = 0; i < model.getSize(); i++)
		{
			listData.addElement(model.getElementAt(i));
		}

		listData.addElement(item);
		destination.setListData(listData);
	}
}