import java.util.Scanner;

public class BaseTP1Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Voulez vous jouer à un jeu ? (Oui ou Non) : ");
		String play = scan.next();
		System.out.println("Play : " + play);
		if(play.equals("o") || play.equals("Oui")  || play.equals("oui")) {
			double targetNumber =  Math.random() * 100;
			System.out.println("Le nombre est" + targetNumber);
			System.out.println("Saisir un nombre entre 1 et 100");
			
			
			
			int triesNb = 0;
			while (scan.hasNextInt()) {
				int numberChoice  = scan.nextInt();
				
				
				if(numberChoice < targetNumber) {
					System.out.println("Le nombre donné est inférieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice > targetNumber) {
					System.out.println("Le nombre  donné est supérieur au nombre à trouver");
					triesNb ++;
				} else if(numberChoice == targetNumber) {
					System.out.println("Bravo, vous avez trouvé le nombre en "+ triesNb + "coups" );
				}
			}
			
			
		} else {
			System.exit(0);
		}
		
	}

}
