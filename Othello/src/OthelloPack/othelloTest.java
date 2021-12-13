package OthelloPack;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class othelloTest {
	@Test
	public final void testParcoursNord() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		int a=(ligne/2),b=(colonne/2);
		for(int lignePosInitial=(ligne/2)-1;lignePosInitial<=a;lignePosInitial++) {
			for(int colPosInitial=(colonne/2)-1;colPosInitial<=b;colPosInitial++) {
				if(lignePosInitial==colPosInitial) {
					plateauDeJeu[lignePosInitial][colPosInitial]='B';
				}else {
					plateauDeJeu[lignePosInitial][colPosInitial]='N';
				}
			}
		}
		assertFalse(validit�Choix.parcoursNord(plateauDeJeu,2,3,1));
		assertFalse(validit�Choix.parcoursNord(plateauDeJeu,14,4,1));
		assertFalse(validit�Choix.parcoursNord(plateauDeJeu,5,2,1));
		assertTrue(validit�Choix.parcoursNord(plateauDeJeu,5,3,1));
//		plateauDeJeu[3][4]='B';
//		plateauDeJeu[2][4]='B';
//		affichage.afficherTableau(plateauDeJeu, ligne, colonne);
//		assertFalse(validitéChoix.parcoursNord(plateauDeJeu,3,4,2));
//		assertFalse(validitéChoix.parcoursNord(plateauDeJeu,5,3,2));
//		assertTrue(validitéChoix.parcoursNord(plateauDeJeu,5,4,2));
//		plateauDeJeu[4][5]='N';
//		affichage.afficherTableau(plateauDeJeu, ligne, colonne);
	}
	@Test
	public final void testParcoursSud() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		int a=(ligne/2),b=(colonne/2);
		for(int lignePosInitial=(ligne/2)-1;lignePosInitial<=a;lignePosInitial++) {
			for(int colPosInitial=(colonne/2)-1;colPosInitial<=b;colPosInitial++) {
				if(lignePosInitial==colPosInitial) {
					plateauDeJeu[lignePosInitial][colPosInitial]='B';
				}else {
					plateauDeJeu[lignePosInitial][colPosInitial]='N';
				}
			}
		}
		assertFalse(validit�Choix.parcoursSud(plateauDeJeu,2,3,1));
		assertFalse(validit�Choix.parcoursSud(plateauDeJeu,5,3,1));
		assertFalse(validit�Choix.parcoursSud(plateauDeJeu,3,4,1));
		assertTrue(validit�Choix.parcoursSud(plateauDeJeu,2,4,1));
		plateauDeJeu[4][3]='B';
		plateauDeJeu[4][4]='B';
		plateauDeJeu[4][2]='B';
		plateauDeJeu[3][4]='N';
		plateauDeJeu[3][3]='N';
		plateauDeJeu[3][2]='N';
		assertTrue(validit�Choix.parcoursSud(plateauDeJeu,2,3,1));
	}
	@Test
	public final void testParcoursEst() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		int a=(ligne/2),b=(colonne/2);
		for(int lignePosInitial=(ligne/2)-1;lignePosInitial<=a;lignePosInitial++) {
			for(int colPosInitial=(colonne/2)-1;colPosInitial<=b;colPosInitial++) {
				if(lignePosInitial==colPosInitial) {
					plateauDeJeu[lignePosInitial][colPosInitial]='B';
				}else {
					plateauDeJeu[lignePosInitial][colPosInitial]='N';
				}
			}
		}
		assertFalse(validit�Choix.parcoursEst(plateauDeJeu,2,3,1));
		assertFalse(validit�Choix.parcoursEst(plateauDeJeu,3,5,1));
		assertFalse(validit�Choix.parcoursEst(plateauDeJeu,3,4,1));
		assertTrue(validit�Choix.parcoursEst(plateauDeJeu,4,2,1));
		char[][]tab=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				tab[y][x]='.';
			}
		}
		tab[2][2]='N';
		tab[3][3]='N';
		tab[4][4]='N';
		tab[4][3]='N';
		tab[2][4]='B';
		tab[3][4]='B';
		tab[4][5]='B';
		tab[5][6]='B';
		affichage.afficherTableau(tab,ligne,colonne);
		assertTrue(validit�Choix.parcoursEst(tab, 4, 2, 1));
	}
	@Test
	public final void testParcoursOuest() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		int a=(ligne/2),b=(colonne/2);
		for(int lignePosInitial=(ligne/2)-1;lignePosInitial<=a;lignePosInitial++) {
			for(int colPosInitial=(colonne/2)-1;colPosInitial<=b;colPosInitial++) {
				if(lignePosInitial==colPosInitial) {
					plateauDeJeu[lignePosInitial][colPosInitial]='B';
				}else {
					plateauDeJeu[lignePosInitial][colPosInitial]='N';
				}
			}
		}
		assertFalse(validit�Choix.parcoursOuest(plateauDeJeu,2,3,1));
		assertFalse(validit�Choix.parcoursOuest(plateauDeJeu,3,2,1));
		assertFalse(validit�Choix.parcoursOuest(plateauDeJeu,4,4,1));
		assertTrue(validit�Choix.parcoursOuest(plateauDeJeu,3,5,1));
	}
	@Test
	public final void testParcoursNE() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		plateauDeJeu[0][2]='B';
		plateauDeJeu[1][1]='N';
		assertFalse(validit�Choix.parcoursNE(plateauDeJeu,5,7,1));
		assertFalse(validit�Choix.parcoursNE(plateauDeJeu,4,3,1));
		assertFalse(validit�Choix.parcoursNE(plateauDeJeu,0,0,1));
		assertFalse(validit�Choix.parcoursNE(plateauDeJeu,1,1,1));
		assertTrue(validit�Choix.parcoursNE(plateauDeJeu,2,0,1));
		char[][]tab=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				tab[y][x]='.';
			}
		}
		tab[2][2]='N';
		tab[3][3]='N';
		tab[4][4]='N';
		tab[4][3]='N';
		tab[2][4]='B';
		tab[3][4]='B';
		tab[4][5]='B';
		tab[5][6]='B';
		affichage.afficherTableau(tab,ligne,colonne);
		assertTrue(validit�Choix.parcoursNE(tab, 4, 2, 1));
	}

	@Test
	public final void testParcoursSE() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		plateauDeJeu[7][7]='B';
		plateauDeJeu[6][6]='N';
		affichage.afficherTableau(plateauDeJeu,ligne,colonne);
		assertFalse(validit�Choix.parcoursSE(plateauDeJeu,5,7,1));
		assertFalse(validit�Choix.parcoursSE(plateauDeJeu,3,6,1));
		assertFalse(validit�Choix.parcoursSE(plateauDeJeu,3,4,1));
		assertFalse(validit�Choix.parcoursSE(plateauDeJeu,6,6,1));
		assertTrue(validit�Choix.parcoursSE(plateauDeJeu,5,5,1));
		char[][]plateau=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateau[y][x]='.';
			}
		}
		plateau[3][3]='N';
		plateau[4][3]='N';
		plateau[2][3]='N';
		plateau[2][4]='B';
		plateau[3][4]='B';
		plateau[4][4]='B';
		System.out.println();
		affichage.afficherTableau(plateau,ligne,colonne);
		assertTrue(validit�Choix.parcoursSE(plateauDeJeu,2,2,1)); // Ligne 180 de validitéChoix si return true alors bon ?! mais je ne vois pas cmnt il peut arriver jusqu'ici puisqu'il est sensé return true ligne 169 ... 
		
	}
	@Test
	public final void testParcoursSO() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		plateauDeJeu[7][0]='B';
		plateauDeJeu[6][1]='N';
		assertFalse(validit�Choix.parcoursSO(plateauDeJeu,8,2,1));
		assertFalse(validit�Choix.parcoursSO(plateauDeJeu,3,6,1));
		assertFalse(validit�Choix.parcoursSO(plateauDeJeu,4,3,1));
		assertFalse(validit�Choix.parcoursSO(plateauDeJeu,7,0,1));
		assertTrue(validit�Choix.parcoursSO(plateauDeJeu,5,2,1));
	}
	@Test
	public final void testParcoursNO() {
		int colonne=8,ligne=8;
		char[][]plateauDeJeu=new char[ligne][colonne];
		for (int x=0;x<colonne;x++) { 
			for(int y=0;y<ligne;y++) {
				plateauDeJeu[x][y]='.';
			}
		}
		plateauDeJeu[0][0]='B';
		plateauDeJeu[1][1]='N';
		assertFalse(validit�Choix.parcoursNO(plateauDeJeu,-2,-2,1));
		assertFalse(validit�Choix.parcoursNO(plateauDeJeu,3,6,1));
		assertFalse(validit�Choix.parcoursNO(plateauDeJeu,4,3,1));
		assertFalse(validit�Choix.parcoursNO(plateauDeJeu,7,0,1));
		assertTrue(validit�Choix.parcoursNO(plateauDeJeu,2,2,1));
	}
	
	
}
