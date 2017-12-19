import java.awt.*;
import java.awt.event.*;

public class  TFMath
{
	public static void main(String[] args) 
	{
		new TFFrame().launchFrame();
	}
}

class TFFrame extends Frame
{
	TextField num1, num2, num3;
	public void launchFrame()
	{
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("=");
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEqual);
		add(num3);

		btnEqual.addActionListener(new MyMonitor(this));
		pack();
		setVisible(true);
	}
}

class MyMonitor implements ActionListener
{
	TFFrame tf = null;
	public MyMonitor(TFFrame tf)
	{
		this.tf = tf;
	}

	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(tf.num1.getText());
		int n2 = Integer.parseInt(tf.num2.getText());
		tf.num3.setText("" + (n1+n2));
	}
}
