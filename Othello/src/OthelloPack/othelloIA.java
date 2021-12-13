package OthelloPack;
import java.util.Random;
import java.util.Scanner;

public class othelloIA {

	public static void ordi() {
		
		Scanner saisie=new Scanner(System.in);
		Random random = new Random();
		int ligne=8,colonne=8,choixCouleur;
		char[][] plateauDeJeu=new char [ligne][colonne];  
		System.out.println("Bienvenue dans le mode joueur contre l'ordinateur. Je me presente je suis l'IA votre adversaire.\nVoici notre plateau de jeu : ");
		initialisationPlateau.tabDepart(plateauDeJeu, ligne, colonne);
		affichage.afficherTableau(plateauDeJeu, ligne, colonne);
		System.out.println();
		System.out.println("Comme vous pouvez le voir il y a des pions noirs et blancs. Les blancs sont ceux qui commencent, a vous de decider votre couleur.\n1.Blanc\n2.Noir");
		
		do {
			choixCouleur=Integer.parseInt(saisie.nextLine());
		}while(choixCouleur<1 || choixCouleur>2);
		String pseudoJoueur="",pseudoOrdi="IA";
		if(choixCouleur==1) {
			pseudoJoueur=scriptIa1("Ok vous serez le joueur aux pions blancs, veuillez maintenant saisir votre pseudo : ",pseudoJoueur,pseudoOrdi);
		}else {
			pseudoJoueur=scriptIa1("Ok vous serez le joueur aux pions noirs, veuillez maintenant saisir votre pseudo : ",pseudoJoueur,pseudoOrdi);
		}
		int continuite=0;
		int joueurBlanc=1,joueurNoir=2,pionsBlancs=30,pionsNoirs=30;
		if(choixCouleur==1) {
			while(continuite!=2&&(pionsBlancs!=0&&pionsNoirs!=0)) {
				if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurBlanc)) {
					System.out.println();
					othelloJvJ.joueurUn(plateauDeJeu,joueurBlanc,pseudoJoueur);
					System.out.println();
					affichage.afficherTableau(plateauDeJeu,ligne,colonne);
					System.out.println();
					System.out.println("Il reste "+pionsBlancs--+" pions a  placer pour "+pseudoJoueur);
					if(continuite>0) {
						continuite--;
					}
				}else if(continuite==0) {
					System.out.println("Vous ne pouvez jouer nulle part ... C'est donc a  moi de jouer");
					continuite++;
				}else {
					System.out.println("Vous et moi ne pouvons jouer nulle part c'est donc la fin de la partie !");
				}
				if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurNoir)==true) {
					int nbPossibilite=possibiliteOrdi(plateauDeJeu,ligne,colonne,joueurNoir);
					int nbAleat=random.nextInt(nbPossibilite);
					int indLigne=choixLigneOrdi(plateauDeJeu,ligne,colonne,joueurNoir,nbPossibilite,nbAleat);
					int indColonne=choixColOrdi(plateauDeJeu,ligne,colonne,joueurNoir,nbPossibilite,nbAleat);
					othelloJvJ.joueurIA(plateauDeJeu,indLigne,indColonne,joueurNoir, pseudoOrdi);
					affichage.afficherTableau(plateauDeJeu, ligne, colonne);
				}
			}
		}else {
			while(continuite!=2&&(pionsBlancs!=0&&pionsNoirs!=0)) {
				if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurBlanc)) {
					int nbPossibilite=possibiliteOrdi(plateauDeJeu,ligne,colonne,joueurBlanc);
					int nbAleat=random.nextInt(nbPossibilite);
					int indLigne=choixLigneOrdi(plateauDeJeu,ligne,colonne,joueurBlanc,nbPossibilite,nbAleat);
					int indColonne=choixColOrdi(plateauDeJeu,ligne,colonne,joueurBlanc,nbPossibilite,nbAleat);
					othelloJvJ.joueurIA(plateauDeJeu,indLigne,indColonne,joueurBlanc, pseudoOrdi);
					affichage.afficherTableau(plateauDeJeu, ligne, colonne);
				}
				if(verif.possibilité(plateauDeJeu, ligne, colonne, joueurNoir)==true) {
					System.out.println();
					System.out.println("Il y a au moins une possiblite de jeu sur le plateau pour "+pseudoJoueur);
					othelloJvJ.joueurUn(plateauDeJeu,joueurNoir,pseudoJoueur);
					System.out.println();
					affichage.afficherTableau(plateauDeJeu,ligne,colonne);
					System.out.println();
					System.out.println("Il reste "+pionsNoirs--+" pions a  placer pour "+pseudoJoueur);
					if(continuite>0) {
						continuite--;
					}
				}else if(continuite==0) {
					System.out.println("Vous ne pouvez jouer nulle part ... C'est donc a  l'IA de jouer");
					continuite++;
				}else {
					System.out.println("Vous et moi ne pouvons jouer nulle part c'est donc la fin de la partie !");
				}
			}
		}
		if (choixCouleur==1) {
			comptage.pointGagnant(plateauDeJeu,ligne,colonne,pseudoOrdi,pseudoJoueur);
		}else {
			comptage.pointGagnant(plateauDeJeu,ligne,colonne,pseudoJoueur,pseudoOrdi);
		}
		System.out.println();
		saisie.close();
	}
	
	public static int possibiliteOrdi(char[][]tab,int ligne,int colonne,int numJoueur) {
		int nbPossibilite=0;
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(validitéChoix.verifPlacement(tab,x,y,numJoueur)==true) {
					nbPossibilite++;
				}
			}
		}
		return nbPossibilite;
	}
	
	public static int choixLigneOrdi(char[][]tab,int ligne,int colonne,int numJoueur,int nbPossibilite,int nbAleat) {
		int []tableau=new int[nbPossibilite];
		int indTab=0;
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(validitéChoix.verifPlacement(tab,x,y,numJoueur)==true) {
					tableau[indTab]=x;
					indTab++;
				}
			}
		}
		return tableau[nbAleat];
	}
	
	public static int choixColOrdi(char[][]tab,int ligne,int colonne,int numJoueur,int nbPossibilite,int nbAleat) {
		int []tableau=new int[nbPossibilite];
		int indTab=0;
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(validitéChoix.verifPlacement(tab,x,y,numJoueur)==true) {
					tableau[indTab]=y;
					indTab++;
				}
			}
		}
		return tableau[nbAleat];
	}
	
	public static String scriptIa1(String phrase,String pseudoJoueur,String pseudoOrdi) {
		System.out.println(phrase);
		Scanner saisie=new Scanner(System.in);
		pseudoJoueur=saisie.nextLine();
		while(pseudoJoueur.equals(pseudoOrdi)) {
			System.out.println("L'IA c'est moi !!! ne me copier pas");
			pseudoJoueur=saisie.nextLine();
		}
		return pseudoJoueur;
	}
	
}
