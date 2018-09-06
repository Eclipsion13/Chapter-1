package exercises;

import javax.swing.JOptionPane;

public class Dollars {

	public static void main(String[] args) {
		// 
		
		int dollars;
		int twentys;
		int tens;
		int fives;
		int ones;
		String dollarString;
		
		dollarString = JOptionPane.showInputDialog(null, "How many dollars?",
				"Quarts Input", JOptionPane.QUESTION_MESSAGE);
		dollars = Integer.parseInt(dollarString);
		
		twentys = dollars / 20;
		tens = (dollars - (twentys * 20)) / 10;
		fives = (dollars - (twentys * 20) - (tens * 10)) / 5;
		ones = (dollars - (twentys * 20) - (tens * 10) - (fives * 5));
		
		JOptionPane.showMessageDialog(null, "That is equal to " + twentys + " 20s, " + tens + " 10s, " + fives + " 5s, and " + ones + " 1s.");

	}

}
