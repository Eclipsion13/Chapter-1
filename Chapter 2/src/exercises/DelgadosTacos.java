package exercises;

import javax.swing.JOptionPane;

public class DelgadosTacos {

	public static void main(String[] args) {
		// TODO Tacos, Burritos, Enchiladas, Quesadillas, Tamales
		
		final double TACO$ = 2.25;
		final double BURRI$ = 3.25;
		final double ENCHI$ = 2.75;
		final double QUESA$ = 2.25;
		final double TAMAL$ = 3.50;
		int tacos;
		int burris;
		int enchis;
		int quesas;
		int tamals;
		double tacoCost;
		double burriCost;
		double enchiCost;
		double quesaCost;
		double tamalCost;
		double total;
		double totalTax;
		final double TAX = .06;
		String tacoSt;
		String burriSt;
		String enchiSt;
		String quesaSt;
		String tamalSt;

		tacoSt = JOptionPane.showInputDialog(null, "How many tacos?");
		tacos = Integer.parseInt(tacoSt);
		burriSt = JOptionPane.showInputDialog(null, "How many burritos?");
		burris = Integer.parseInt(burriSt);
		enchiSt = JOptionPane.showInputDialog(null, "How many enchiladas?");
		enchis = Integer.parseInt(enchiSt);
		quesaSt = JOptionPane.showInputDialog(null, "How many quesadillas?");
		quesas = Integer.parseInt(quesaSt);
		tamalSt = JOptionPane.showInputDialog(null, "How many tamales?");
		tamals = Integer.parseInt(tamalSt);

		tacoCost = tacos * TACO$;
		burriCost = burris * BURRI$;
		enchiCost = enchis * ENCHI$;
		quesaCost = quesas * QUESA$;
		tamalCost = tamals * TAMAL$;
		total = tacoCost + burriCost + enchiCost + quesaCost + tamalCost;
		totalTax = (total * TAX) + total;
		
		JOptionPane.showMessageDialog(null, "Your total order cost $" + total +
				" without tax. \nWith tax it cost $" + totalTax + ".");
		JOptionPane.showMessageDialog(null, "Thank you for purcahsing from Delgado's Tacos! \n" +
				"                        /~;+^;+\\         \n"
				+ "   ________(_______)_________\n" + "  \\                                                          |\n" + 
						"   |]==========v^^^^^^^^v====|\n" + " _|]   Delgado's  |     O/          |          |\n" + 
						"/+++++Tacos++|___|_____|++++|\n" + "|_________________________|\n" + 
						"     |___|                               |___|     \n");

	}

}
