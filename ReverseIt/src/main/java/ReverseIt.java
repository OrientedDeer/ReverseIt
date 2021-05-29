import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReverseIt extends JFrame{
	private static final long serialVersionUID = 1L;

	public ReverseIt() {
		setTitle("Reverse It!");
		setLayout(new FlowLayout());
		JLabel LeftText = new JLabel("Text");
		JTextField MiddleField = new JTextField(15);
		JButton RightButton = new JButton("Reverse It");
		
		add(LeftText, FlowLayout.LEFT);
		add(MiddleField, FlowLayout.CENTER);
		add(RightButton, FlowLayout.RIGHT);

		RightButton.addActionListener(e ->{
			JDialog popupWindow = new JDialog();
			JButton exit = new JButton("OK");
			if(MiddleField.getText().equals("") || MiddleField.getText() == null) {
				exit.addActionListener(f -> {
					popupWindow.dispose();
				});
				popupWindow.add(new JLabel("Nothing to reverse"), BorderLayout.CENTER);
				
			}
			else {
				exit.addActionListener(f -> {
					popupWindow.dispose();
				});
				char[] input = MiddleField.getText().toCharArray();
				String output = "";
				for(int i = input.length-1;i>=0;i--) {
					output+=input[i];
				}
				
				popupWindow.add(new JLabel(output), BorderLayout.CENTER);
				
			}
			popupWindow.setTitle("Message");
			popupWindow.add(exit, BorderLayout.SOUTH);
			popupWindow.pack();
			popupWindow.setLocationRelativeTo(this);
			popupWindow.setVisible(true);
		});
		pack();
		setLocationRelativeTo(null);
		//DO_NOTHING_ON_CLOSE
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		JFrame f = new ReverseIt();
		f.setVisible(true);

	}
}
