package OthelloPack;

public class verif {
	public static boolean possibilit�(char[][]tab,int ligne,int colonne,int numJoueur) {
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(validit�Choix.verifPlacement(tab,x,y,numJoueur)==true) {
					return true;
				}
			}
		}
		return false;
	}
}
