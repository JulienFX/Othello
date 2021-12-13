package OthelloPack;

public class modif {
	
	public static void changementPion(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		
		int indChangeLigneMoins=indLigne-1,indChangeLignePlus=indLigne+1,indChangeColMoins=indColonne-1,indChangeColPlus=indColonne+1;
		
		if(validitéChoix.parcoursNord(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionNord(tab,indChangeLigneMoins,indColonne,'B');
			}else {
				actionNord(tab,indChangeLigneMoins,indColonne,'N');
			}
		}
		
		if(validitéChoix.parcoursSud(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionSud(tab,indChangeLignePlus,indColonne,'B');
			}else {
				actionSud(tab,indChangeLignePlus,indColonne,'N');
			}
		}
		
		if(validitéChoix.parcoursEst(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionEst(tab,indLigne,indChangeColPlus,'B');
			}else {
				actionEst(tab,indLigne,indChangeColPlus,'N');
			}
		}
		
		if(validitéChoix.parcoursOuest(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionOuest(tab,indLigne,indChangeColMoins,'B');
			}else {
				actionOuest(tab,indLigne,indChangeColMoins,'N');
			}
		}
		
		if(validitéChoix.parcoursNE(tab,indLigne,indColonne,numJoueur)){
			if(numJoueur==1) {
				actionNE(tab,indChangeLigneMoins,indChangeColPlus,'B');
			}else {
				actionNE(tab,indChangeLigneMoins,indChangeColPlus,'N');
			}
		}
		
		if(validitéChoix.parcoursNO(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionNO(tab,indChangeLigneMoins,indChangeColMoins,'B');
			}else {
				actionNO(tab,indChangeLigneMoins,indChangeColMoins,'N');
			}
		}
		
		if(validitéChoix.parcoursSE(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionSE(tab,indChangeLignePlus,indChangeColPlus,'B');
			}else {
				actionSE(tab,indChangeLignePlus,indChangeColPlus,'N');
			}
		}
		
		if(validitéChoix.parcoursSO(tab,indLigne,indColonne,numJoueur)) {
			if(numJoueur==1) {
				actionSO(tab,indChangeLignePlus,indChangeColMoins,'B');
			}else {
				actionSO(tab,indChangeLignePlus,indChangeColMoins,'N');
			}
		}
				
		if(numJoueur==1) {
			tab[indLigne][indColonne]='B';
		}else {
			tab[indLigne][indColonne]='N';
		}
	}
	
	public static void actionNord(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne--;
		}
	}
	
	public static void actionSud(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne++;
		}
	}
	
	public static void actionEst(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indColonne++;
		}
	}
	
	public static void actionOuest(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indColonne--;
		}
	}
	
	public static void actionNE(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne--;
			indColonne++;
		}
	}
	
	public static void actionNO(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne--;
			indColonne--;
		}
	}
	
	public static void actionSE(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne++;
			indColonne++;
		}
	}
	
	public static void actionSO(char [][]tab,int indLigne,int indColonne,char c) {
		while(tab[indLigne][indColonne]!=c) {
			tab[indLigne][indColonne]=c;
			indLigne++;
			indColonne--;
		}
	}
	
}