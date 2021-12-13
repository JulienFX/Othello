package OthelloPack;

public class comptage {
	public static void pointGagnant(char[][]tab,int ligne,int colonne,String pseudoJ1,String pseudoJ2) {
		int pointBlanc=0,pointNoir=0;
		for(int x=0;x<ligne;x++) {
			for(int y=0;y<colonne;y++) {
				if(tab[y][x]=='N') {
					pointNoir++;
				}else if(tab[y][x]=='B'){
					pointBlanc++;
				}
			}
		}
		if(pointNoir>pointBlanc) {
			System.out.println("C'est "+pseudoJ2+" qui remporte la partie avec "+pointNoir+" contre "+pointBlanc+" pour "+pseudoJ1);
		}else if(pointNoir<pointBlanc) {
			System.out.println("C'est "+pseudoJ1+" qui remporte la partie avec "+pointBlanc+" contre "+pointNoir+" pour "+pseudoJ2);
		}else {
			System.out.println("Il y a eu égalité !!");
		}
	}
}
