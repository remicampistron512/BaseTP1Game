import java.util.Scanner;

public class BaseTP1Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez vous jouer à un jeu ? (Oui ou Non) : ");
		String play = scan.next();
		
		if(play.equals("o") || play.equals("Oui")  || play.equals("oui")) {
			int triesNb = 0;
			double targetNumber = Math.floor(Math.random() * 100)  ;
	
			System.out.println("Saisir un nombre entre 1 et 100");
			triesNb ++;
			
			
			while (scan.hasNextInt()) {
				System.out.println("Saisir un nombre entre 1 et 100");
				int numberChoice  = scan.nextInt();
				triesNb ++;
				
				if(numberChoice < targetNumber) {
					System.out.println("Le nombre donné est inférieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice > targetNumber) {
					System.out.println("Le nombre  donné est supérieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice == targetNumber) {
					System.out.println("Bravo, vous avez trouvé le nombre en "+ triesNb + " coups" );
				}
			}
			
			
		} else {
			System.exit(0);
		}
		
	}

}
