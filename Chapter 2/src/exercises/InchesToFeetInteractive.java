package exercises;

import javax.swing.JOptionPane;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// IRec / 12 = feet --- IRec % 12 = xtraI
		
		final int INCHES = 12;
		int feet;
		int extraInches;
		int inchesRequired;
		String inchesString;
		
		inchesString = JOptionPane.showInputDialog(null, "How many inches?",
				"Quarts Input", JOptionPane.QUESTION_MESSAGE);
		inchesRequired = Integer.parseInt(inchesString);
		
		feet = inchesRequired / INCHES;
		extraInches = inchesRequired % INCHES;
		
		JOptionPane.showMessageDialog(null, inchesRequired +
				" equals " + feet + " feet plus " + extraInches + " inches.");

	}

}
