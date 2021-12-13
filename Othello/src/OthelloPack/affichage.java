package OthelloPack;


public class affichage {
	public static void afficherTableau(char[][]tableau,int ligne,int colonne) {
		// Mise en forme du tableau (visuelle)
			for(int bordureHautTab=0;bordureHautTab<ligne;bordureHautTab++) {
				System.out.print("+--");
			}
			System.out.print("+");
			System.out.println();
			for (int y=0;y<ligne;y++) { 
				System.out.print("|");
				for (int x=0;x<colonne;x++) {
					System.out.print(" "+tableau[y][x]+" ");
				}
				System.out.print("| L"+(y+1));
				System.out.println();
			}
			for(int bordureBasTab=0;bordureBasTab<ligne;bordureBasTab++) {
				System.out.print("+--");
			}
			System.out.print("+");
			System.out.println();
			for (int num=0;num<ligne;num++) {
				System.out.print(" C"+(num+1));
			}
	}
}
