package OthelloPack;

public class initialisationPlateau {
	public static void tabDepart(char[][]tab,int ligne,int colonne){
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				tab[x][y]='.';
			}
		}

		int a=(ligne/2),b=(colonne/2);
		for(int lignePosInitial=(ligne/2)-1;lignePosInitial<=a;lignePosInitial++) {
			for(int colPosInitial=(colonne/2)-1;colPosInitial<=b;colPosInitial++) {
				if(lignePosInitial==colPosInitial) {
					tab[lignePosInitial][colPosInitial]='B';
				}else {
					tab[lignePosInitial][colPosInitial]='N';
				}
			}
		}
	}
}
