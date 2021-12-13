package OthelloPack;

public class verif {
	public static boolean possibilité(char[][]tab,int ligne,int colonne,int numJoueur) {
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(validitéChoix.verifPlacement(tab,x,y,numJoueur)==true) {
					return true;
				}
			}
		}
		return false;
	}
}
