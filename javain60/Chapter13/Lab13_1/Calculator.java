import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame
{
	private JButton [] buttons;
	private JTextField display;

	public Calculator(String title)
	{
		super(title);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addButtons();
		addDisplay();
		CalculatorListener listener = new CalculatorListener(display);
		for(int i = 0; i < buttons.length; i++)
		{
			buttons[i].addActionListener(listener);
		}		
	}

	private void addButtons()
	{
		JPanel center = new JPanel(new GridLayout(4, 4, 10, 10));
		buttons = new JButton[16];
		for(int i = 0; i <= 9; i++)
		{
			buttons[i] = new JButton("" + i);
		}

		buttons[10] = new JButton("/");
		buttons[11] = new JButton("*");
		buttons[12] = new JButton("-");
		buttons[13] = new JButton("+");
		buttons[14] = new JButton("=");
		buttons[15] = new JButton(".");

		for(int i = 7; i <= 10; i++)
		{
			center.add(buttons[i]);
		}

		for(int i = 4; i <= 6; i++)
		{
			center.add(buttons[i]);
		}

		center.add(buttons[11]);

		for(int i = 1; i <= 3; i++)
		{
			center.add(buttons[i]);
		}
		center.add(buttons[12]);
		center.add(buttons[0]);
		center.add(buttons[15]);
		center.add(buttons[14]);
		center.add(buttons[13]);


		this.getContentPane().add(center, BorderLayout.CENTER);
	}

	private void addDisplay()
	{
		JPanel north = new JPanel(new BorderLayout());
		display = new JTextField();
		display.setEditable(false);
		display.setBackground(Color.WHITE);
		display.setText("0.0");
		north.add(display, BorderLayout.CENTER);
		this.getContentPane().add(north, BorderLayout.NORTH);
	}

	public static void main(String [] args)
	{
		Calculator calc = new Calculator("My Calculator");
		calc.setSize(200,220);
		calc.setResizable(false);
		calc.setVisible(true);
	}
}