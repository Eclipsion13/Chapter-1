package exercises;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) {
		// TODO Change stuff to fit this exercise
		
		final double COST_OF_DOZEN = 3.25;
		final double COST_OF_ONE = .45;
		final int AMOUNT_IN_DOZEN = 12;
		int dozens;
		int extraEggs;
		int eggsOrdered;
		double costOfDozens;
		double costOfExtras;
		double total;
		String eggsString;
		
		eggsString = JOptionPane.showInputDialog(null, "How many eggs?",
				"Quarts Input", JOptionPane.QUESTION_MESSAGE);
		eggsOrdered = Integer.parseInt(eggsString);
		
		dozens = eggsOrdered / AMOUNT_IN_DOZEN;
		extraEggs = eggsOrdered % AMOUNT_IN_DOZEN;
		costOfDozens = dozens * COST_OF_DOZEN;
		costOfExtras = extraEggs * COST_OF_ONE;
		total = costOfDozens + costOfExtras;
		
		JOptionPane.showMessageDialog(null, "You ordered " + eggsString +
				" eggs. That's " + dozens + " dozen at $" + COST_OF_DOZEN +
				" per dozen and " + extraEggs + " loose eggs at $" + COST_OF_ONE +
				" each for a total of $" + total + ".");

	}

}
