import java.awt.*;

public class TextComponentDemo extends Frame
{
	private TextField textField;
	private TextArea textArea;
	private Button enter, clear;

	public TextComponentDemo (String title)
	{
		super(title);

		textField = new TextField();
		textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setEditable(false);

		enter = new Button("Enter");
		clear = new Button("Clear");

		//layout the GUI
		this.add(textArea, BorderLayout.CENTER);
		Panel south = new Panel(new BorderLayout());
		south.add(textField, BorderLayout.CENTER);

		Panel southEast = new Panel(new BorderLayout());
		southEast.add(enter, BorderLayout.EAST);
		southEast.add(clear, BorderLayout.WEST);
		south.add(southEast, BorderLayout.EAST);

		this.add(south, BorderLayout.SOUTH);

		//setup the event handling
		CreateList listener = new CreateList(textField, textArea);
		enter.addActionListener(listener);
		clear.addActionListener(listener);
		textField.addActionListener(listener);
	}

	public TextField getTextField()
	{
		return textField;
	}

	public static void main(String [] args)
	{
		TextComponentDemo f = new TextComponentDemo ("TextComponentDemo ");
		f.setSize(300,200);
		f.setVisible(true);
		f.getTextField().requestFocus(); // let the text field have the initial focus
	}
}