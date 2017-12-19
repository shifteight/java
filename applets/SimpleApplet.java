import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class SimpleApplet extends Applet{

  String text = "I'm a simple applet";

  public void init() {
	text = "I'm a simple applet";
	setBackground(Color.cyan);
  }

  public void start() {
        System.out.println("starting...");
  }

  public void stop() {
        System.out.println("stopping...");
  }

  public void destroy() {
        System.out.println("preparing to unload...");
  }

   public void paint(Graphics g){
	System.out.println("Paint");
	g.setColor(Color.blue);
	g.drawRect(0, 0, 
		   getSize().width -1,
		   getSize().height -1);
	g.setColor(Color.red);
	g.drawString(text, 15, 25);
   }
}
