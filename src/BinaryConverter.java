import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame Jframe = new JFrame();
	JPanel Jpanel = new JPanel();
	JTextField JtextField = new JTextField();
	JLabel Jlabel = new JLabel();
	JButton Jbutton = new JButton("Convert");

	public static void main(String[] args) {
		BinaryConverter binaryConverter = new BinaryConverter();
		binaryConverter.start();
	}

	void start() {
		JtextField.setPreferredSize(new Dimension(250, 20));
		Jbutton.addActionListener(this);
		Jframe.add(Jpanel);
		Jpanel.add(JtextField);
		Jpanel.add(Jbutton);
		Jpanel.add(Jlabel);
		Jframe.setVisible(true);
		Jframe.setTitle("Binary Converter");
		Jframe.pack();
	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string = convert(JtextField.getText());
		Jlabel.setText(string);
		Jframe.pack();
	}
}
