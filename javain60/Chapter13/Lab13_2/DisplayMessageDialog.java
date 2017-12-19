import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;

public class DisplayMessageDialog extends MouseAdapter
{
	public void mouseClicked(MouseEvent e)
	{
		if(e.getClickCount() == 2)
		{
			JList list = (JList) e.getSource();
			String name = (String) list.getSelectedValue();
			System.out.println("Clicked on " + name);
		}
	}
}