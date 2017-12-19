import java.awt.*;
import java.awt.event.*;

public class Shell {
	// Listener for button event
	private static class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String inValue;
			inValue = inputField.getText();
			System.out.println(inValue);
		}
	}
	
	// Declare all variables accessed within the listeners
	private static Frame outDisplay;
	private static TextField inputField;
	private static Label inputLabel;
		
	public static void main(String[] args) {
		// Other declarations
		Button button;
		ButtonListener listener;
		// Instantiate variables
		outDisplay = new Frame();
		outDisplay.setLayout(new GridLayout(0,1));
		inputField = new TextField(6);
		inputLabel = new Label("Data Entry:");
		button = new Button("Enter");
		outDisplay.add(button);
		listener = new ButtonListener();
		button.addActionListener(listener);
		outDisplay.add(inputLabel);
        outDisplay.add(inputField);
        outDisplay.pack();
        outDisplay.setVisible(true);

		// Register listener with window event source
		outDisplay.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent event) {
				outDisplay.dispose();
				System.exit(0);
			}
		});
	}
}
		
