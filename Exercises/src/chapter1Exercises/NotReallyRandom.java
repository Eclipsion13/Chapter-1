package chapter1Exercises;

import javax.swing.JOptionPane;
public class NotReallyRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Walk up to someone and say...");
		JOptionPane.showMessageDialog(null,(1+ (int)(Math.random() * 9)+ (1+ (int)(Math.random() * 9) + "!")));
		JOptionPane.showMessageDialog(null,"They will be confused.");
		JOptionPane.showMessageDialog(null,"Unless you did that before.");
		JOptionPane.showMessageDialog(null,"Then they will think you are crazy.");
	}

}
