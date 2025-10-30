import java.util.Scanner;

public class BaseTP1Game {

	public static void main(String[] args) {
		// ouvre un scanner pour enregister les entrées utilisateur
		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez vous jouer à un jeu ? (Oui ou Non) : ");
		// récupère l'entrée utilisateur
		String play = scan.next();
		
		// l'utilisateur commence le jeu
		if(play.equals("o") || play.equals("Oui")  || play.equals("oui")) {
			// le nombre d'essais pour trouver le bon nombre
			int triesNb = 0;
			// le nombre à trouver
			double targetNumber = Math.floor(Math.random() * 100)  ;
	
			System.out.println("Saisir un nombre entre 1 et 100");
			triesNb ++;
			
			// on boucle sur l'entrée utilisateur, à chaque essai on incrémente le nombre d'essais
			while (scan.hasNextInt()) {
				System.out.println("Saisir un nombre entre 1 et 100");
				int numberChoice  = scan.nextInt();
				triesNb ++;
				System.out.println("le numero à trouver " + targetNumber);
				if(numberChoice < targetNumber) {
					System.out.println("Le nombre donné est inférieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice > targetNumber) {
					System.out.println("Le nombre  donné est supérieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice == targetNumber) {
					// l'utilisateur a deviné le nombre s'il le souhaite il peut continuer la partie
					System.out.println("Bravo, vous avez trouvé le nombre en "+ triesNb + " coups" );
					System.out.println("Voulez-vous continuer ?  (Oui ou Non) :");
					play = scan.next();
					if(play.equals("o") || play.equals("Oui")  || play.equals("oui")) {
						triesNb = 0;
						System.out.println("Saisir un nombre entre 1 et 100");
						targetNumber = Math.floor(Math.random() * 100)  ;
						continue;						
					} else {
						scan.close();
						System.exit(0);						
					}
				}
			}
			
			
		} else {
			scan.close();
			System.exit(0);
		}
		
	}

}
