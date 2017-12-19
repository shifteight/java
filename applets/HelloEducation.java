import java.awt.Graphics;
import java.applet.Applet;

public class HelloEducation extends Applet
{
	public String s;
	public void init() {
		s = new String("Welcome to Tongfang Education!");
	}
	public void paint(Graphics g) {
		g.drawString(s, 25, 25);
	}

}
