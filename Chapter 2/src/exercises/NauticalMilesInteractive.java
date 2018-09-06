package exercises;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// nauts * kilosInNaut = total kilos?
		
		double kilosInNaut = 1.852;
		double milesInNaut = 1.150779;
		double nauts;
		double totalKilos;
		double totalMiles;
		String nautString;
		
		nautString = JOptionPane.showInputDialog(null, "How many nauts?", "Nauts Input", JOptionPane.QUESTION_MESSAGE);
		nauts = Double.parseDouble(nautString);
		totalKilos = nauts * kilosInNaut;
		totalMiles = nauts * milesInNaut;
		
		JOptionPane.showMessageDialog(null, "There are " + totalKilos + " kilos and "
		+ totalMiles + " miles in " + nauts + " nautical miles");
		
		

	}

}
