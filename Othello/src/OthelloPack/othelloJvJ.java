package OthelloPack;
import java.util.Scanner;
public class othelloJvJ {
	public static void joueurVsJoueur(){
		Scanner saisie=new Scanner(System.in);
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		initialisationPlateau.tabDepart(plateauDeJeu,ligne,colonne);
		affichage.afficherTableau(plateauDeJeu,ligne,colonne);
		// dÃ©but partie
		System.out.println();
		System.out.print("Voici votre plateau de jeu. Comme le veux la regle c'est le joueur aux pions blancs qui commencent. \nJoueur aux pions blancs ! Veuillez rentrer votre pseudo : ");
		String pseudoJ1=saisie.nextLine();
		System.out.print("Joueur aux pions noirs ! Veuillez rentrer votre pseudo : ");
		String pseudoJ2=saisie.nextLine();
		if(pseudoJ2.equals(pseudoJ1)) {
			while(pseudoJ2.equals(pseudoJ1)){
				System.out.println("Ce pseudo est pris par le joueur aux pions blancs, veuillez en prendre un autre ! : ");
				pseudoJ2=saisie.nextLine();
			}
		}
		
		int continuite=0;
		int joueurBlanc=1,joueurNoir=2,pionsBlancs=30,pionsNoirs=30;
		while(continuite!=2&&(pionsNoirs!=0&&pionsBlancs!=0)) {
			if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurBlanc)==true) {
				System.out.println("Il y a au moins une possiblité de jeu sur le plateau pour "+pseudoJ1);
				joueurUn(plateauDeJeu,joueurBlanc,pseudoJ1);
				System.out.println();
				affichage.afficherTableau(plateauDeJeu,ligne,colonne);
				System.out.println();
				System.out.println("Il reste "+pionsBlancs--+" pions a  placer pour "+pseudoJ1);
				if(continuite>0) {
					continuite--;
				}
			}else if(continuite==0) {
				System.out.println("Vous ne pouvez jouer nulle part ... C'est donc a  "+pseudoJ2+" de jouer");
				continuite++;
			}else {
				System.out.println("Vous et "+pseudoJ2+" ne pouvez jouer nulle part c'est donc la fin de la partie !");
			}
			if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurNoir)==true) {
				System.out.println("Il y a au moins une possiblité de jeu");
				joueurDeux(plateauDeJeu,joueurNoir,pseudoJ2);
				affichage.afficherTableau(plateauDeJeu,ligne,colonne);
				System.out.println();
				System.out.println("Il reste "+pionsNoirs--+" pions a placer pour "+pseudoJ2);
				if(continuite>0) {
					continuite--;
				}
			}else if(continuite==0) {
				System.out.println("Vous ne pouvez jouer nulle part ... C'est donc a  "+pseudoJ1+" de jouer");
				continuite++;
			}else {
				System.out.println("Vous et "+pseudoJ1+" ne pouvez jouer nulle part c'est donc la fin de la partie !");
			}
          }
		comptage.pointGagnant(plateauDeJeu,ligne,colonne,pseudoJ1,pseudoJ2);
		System.out.println();
		saisie.close();
		
	}
	
	public static void joueurUn (char [][]plateauDeJeu,int numJoueur,String pseudoJ1) {
		Scanner saisie=new Scanner(System.in);
		System.out.print("OK "+pseudoJ1+" Veuillez choisir la ligne sur laquelle vous allez jouer : ");
		int choixLigne=Integer.parseInt(saisie.nextLine());
		System.out.print("OK, maintenant choisissez votre colonne : ");
		int choixColonne=Integer.parseInt(saisie.nextLine());
		if(validitéChoix.verifPlacement(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur)==true) {
			modif.changementPion(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur);
		}else {
			while(validitéChoix.verifPlacement(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur)==false) {
				System.out.println("Impossible de jouer a  cet endroit");
				System.out.print("Ressaisir Ligne : ");
				choixLigne=Integer.parseInt(saisie.nextLine());
				System.out.print("Ressaisir Colonne : ");
				choixColonne=Integer.parseInt(saisie.nextLine());
			}
			modif.changementPion(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur);
		}
		System.out.println();
		
	}
	
	public static void joueurDeux(char [][]plateauDeJeu,int numJoueur,String pseudoJ2) {
		Scanner saisie=new Scanner(System.in);
		System.out.print("OK "+pseudoJ2+" Veuillez choisir la ligne sur laquelle vous allez jouer : ");
		int choixLigne=Integer.parseInt(saisie.nextLine());
		System.out.print("OK, maintenant choisissez votre colonne : ");
		int choixColonne=Integer.parseInt(saisie.nextLine());
		if(validitéChoix.verifPlacement(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur)==true) {
			modif.changementPion(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur);
		}else {
			while(validitéChoix.verifPlacement(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur)==false) {
				System.out.println("Impossible de jouer a  cet endroit");
				System.out.print("Ressaisir Ligne : ");
				choixLigne=Integer.parseInt(saisie.nextLine());
				System.out.print("Ressaisir Colonne : ");
				choixColonne=Integer.parseInt(saisie.nextLine());
			}
			modif.changementPion(plateauDeJeu,choixLigne-1,choixColonne-1,numJoueur);
		}
	}
	
	public static void joueurIA(char [][]plateauDeJeu,int ligne,int colonne,int numJoueur,String pseudoIA) {
		modif.changementPion(plateauDeJeu,ligne,colonne,numJoueur);
	}
	
	
}

