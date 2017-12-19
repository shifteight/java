import java.awt.event.*;
import java.awt.*;

public class HighlightComponent extends MouseAdapter
{
	private Color previousColor;

	public void mouseEntered(MouseEvent e)
	{
		Component component = (Component) e.getSource();
		previousColor = component.getBackground();
		component.setBackground(Color.WHITE);
	}

	public void mouseExited(MouseEvent e)
	{
		Component component = (Component) e.getSource();
		component.setBackground(previousColor);
	}
}