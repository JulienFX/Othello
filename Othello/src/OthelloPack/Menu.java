package OthelloPack;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		Scanner saisie=new Scanner(System.in);
		int choix=0;
		do {
			System.out.println("       OTHELLO");
			System.out.println("       -------");
			System.out.println("1. Joueur VS IA\n2. Joueur VS joueur\n3. Règles du jeu\n4. Quitter");
			choix=Integer.parseInt(saisie.nextLine());
			switch(choix) {
			case 1:
				othelloIA.ordi();
				break;
			case 2:
				othelloJvJ.joueurVsJoueur();
				break;
			case 3:
				rules.RegleDuJeu();
				break;
			case 4:
				System.out.println("Au revoir !");
				break;
			}
		}while(choix!=4);
		saisie.close();

	}

}
