import javax.swing.*;
import java.awt.event.*;

public class IMHandler implements ActionListener
{
	private JTextField textField;
	private JList list;

	public IMHandler(JTextField t, JList l)
	{
		textField = t;
		list = l;
	}

	public void actionPerformed(ActionEvent a)
	{
		String message = textField.getText();
		if(message != "")
		{
			ListModel model = list.getModel();
			int size = model.getSize();
			for(int i = 0; i < size; i++)
			{
				System.out.println(message + " " + model.getElementAt(i));
			}
		}
	}
}