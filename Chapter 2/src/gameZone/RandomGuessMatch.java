package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		final int MAX = 5;
		int guess;
		String guessString;
		int off;
		boolean trueOrFalse;
		
		random = 1 + (int)(Math.random() * MAX);
		
		guessString = JOptionPane.showInputDialog(null, "Choose a number between 1 and " + MAX);
		guess = Integer.parseInt(guessString);
		
		off = random - guess;
		
		trueOrFalse = false == (random != guess);
		
		JOptionPane.showMessageDialog(null, "You were " + off + " off. ");
		JOptionPane.showMessageDialog(null, guess + " = " + random + " " + trueOrFalse);

	}

}
