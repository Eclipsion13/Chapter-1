package exercises;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// QRec / 4 = gallons --- QRec % 4 = xtraQ
		
		final int QUARTS = 4;
		int gallons;
		int extraQuarts;
		int quartsRequired;
		String quartsString;
		
		quartsString = JOptionPane.showInputDialog(null, "How many quarts?",
				"Quarts Input", JOptionPane.QUESTION_MESSAGE);
		quartsRequired = Integer.parseInt(quartsString);
		
		gallons = quartsRequired / QUARTS;
		extraQuarts = quartsRequired % QUARTS;
		
		JOptionPane.showMessageDialog(null, "A job that needs " + quartsRequired +
				" quarts requires " + gallons + " gallons plus " + extraQuarts + " quarts.");

	}

}
