package sport;

import java.util.ArrayList;

import hochschule.Person;

public class SportMain {

	public static void main(String[] args) {

		ArrayList<Person> members = new ArrayList<>();
		members.add(new Spieler("Emil", "Schulz", "Torwart", 0));
		members.add(new Spieler("Alexander", "Mayer", "Stürmer", 4));
		members.add(new Trainer("Mira", "Martens"));
		members.add(new Trainer("Lisa", "Spurt"));
//		members.add(new Trainer("Lisa", "Spurt", 14992));
		members.add(new Spieler("Thorsten", "Larsen", "Mittelfeld", 2));
		
		System.out.println("Trainer:");

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) instanceof Trainer) {
				System.out.println(members.get(i));
			}
		}
		
		System.out.println("\nSpieler:");
		
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) instanceof Spieler) {
				System.out.println(members.get(i));
			}
		}
		
		//Referenzbeispiel
//		Spieler a = new Spieler("a", "bin ich", "Torwart", 0);
//		Spieler b = new Spieler("b", "bin ich", "Mittelfeld", 0);
//		
//		System.out.println(a);
//		System.out.println(b);
//
//		a = b;
//		b.setPosition("Stürmer");
//
//		System.out.println(a);
//		System.out.println(b);
}
}
