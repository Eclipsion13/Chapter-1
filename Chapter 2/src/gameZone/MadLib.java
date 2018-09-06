package gameZone;

import javax.swing.JOptionPane;

public class MadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String noun1;
		String noun2;
		String verb1;
		String verb2;
		
		name = JOptionPane.showInputDialog(null, "Insert a name:", "Name");
		noun1 = JOptionPane.showInputDialog(null, "Insert a noun:", "Noun 1");
		noun2 = JOptionPane.showInputDialog(null, "Insert a noun:", "Noun 2");
		verb1 = JOptionPane.showInputDialog(null, "Insert a verb:", "Verb 1");
		verb2 = JOptionPane.showInputDialog(null, "Insert a verb:", "Verb 2");
		
		JOptionPane.showMessageDialog(null, "It was a beutiful morning");
		JOptionPane.showMessageDialog(null, "But " + name + " forgot to wake up.");
		JOptionPane.showMessageDialog(null, name + " had to " + verb1 + " today.");
		JOptionPane.showMessageDialog(null, name + " did not like to " + verb1 + " so instead they " + verb2 + "ed");
		JOptionPane.showMessageDialog(null, "It all went horribly wrong for " + name);
		JOptionPane.showMessageDialog(null, "They went to " + noun1 + " instead");
		JOptionPane.showMessageDialog(null, "They saw " + noun2 + " as well");
		JOptionPane.showMessageDialog(null, name + " was exausted, so they went to bed");
		

	}

}
