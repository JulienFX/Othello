package OthelloPack;

public class validitéChoix {
	public static boolean verifPlacement(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		if(parcoursNord(tab,indLigne,indColonne,numJoueur)==true||parcoursSud(tab,indLigne,indColonne,numJoueur)==true||parcoursEst(tab,indLigne,indColonne,numJoueur)==true||parcoursOuest(tab,indLigne,indColonne,numJoueur)==true||parcoursNE(tab,indLigne,indColonne,numJoueur)==true||parcoursNO(tab,indLigne,indColonne,numJoueur)==true||parcoursSE(tab,indLigne,indColonne,numJoueur)==true||parcoursSO(tab,indLigne,indColonne,numJoueur)==true) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean parcoursNord (char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indLigneMoins=indLigne-1;
		if(indLigne<=1||indLigne>7||indColonne>7||indColonne<0) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if((tab[indLigneMoins][indColonne]=='N')&&(numJoueur==1)) {
			while(indLigneMoins>0 && tab[indLigneMoins][indColonne]!='B') { 
				indLigneMoins--;
				if(tab[indLigneMoins][indColonne]=='.') {
					return false;
				}
			}
			if(tab[indLigneMoins][indColonne]!='B') {
				return false;
			}
			return true;
		}else if((tab[indLigneMoins][indColonne]=='B')&&(numJoueur==2)){
			while(indLigneMoins>0 && tab[indLigneMoins][indColonne]!='N') {
				indLigneMoins--;
				if(tab[indLigneMoins][indColonne]=='.') {
					return false;
				}
			}
			if(tab[indLigneMoins][indColonne]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursSud(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indLignePlus=indLigne+1;
		if(indLigne>=6||indLigne<0||indColonne>7||indColonne<0) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLignePlus][indColonne]=='N'&&numJoueur==1) {
			while(indLignePlus<7 && tab[indLignePlus][indColonne]!='B') {
				indLignePlus++;
				if(tab[indLignePlus][indColonne]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColonne]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLignePlus][indColonne]=='B'&&numJoueur==2) {
			while(indLignePlus<7 &&tab[indLignePlus][indColonne]!='N') {
				indLignePlus++;
				if(tab[indLignePlus][indColonne]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColonne]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursEst(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indColPlus=indColonne+1;
		if(indLigne>7||indLigne<0||indColonne>=6||indColonne<0) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLigne][indColPlus]=='N'&&numJoueur==1) {
			while(indColPlus<7 && tab[indLigne][indColPlus]!='B') {
				indColPlus++;
				if(tab[indLigne][indColPlus]=='.') {
					return false;
				}
			}
			if(tab[indLigne][indColPlus]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLigne][indColPlus]=='B'&&numJoueur==2) {
			while(indColPlus<7 &&tab[indLigne][indColPlus]!='N') {
				indColPlus++;
				if(tab[indLigne][indColPlus]=='.') {
					return false;
				}
			}
			if(tab[indLigne][indColPlus]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursOuest(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indColMoins=indColonne-1;
		if(indLigne>7||indLigne<0||indColonne>7||indColonne<=1) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLigne][indColMoins]=='N'&&numJoueur==1) {
			while(indColMoins>0 && tab[indLigne][indColMoins]!='B') {
				indColMoins--;
				if(tab[indLigne][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLigne][indColMoins]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLigne][indColMoins]=='B'&&numJoueur==2) {
			while(indColMoins>0 &&tab[indLigne][indColMoins]!='N') {
				indColMoins--;
				if(tab[indLigne][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLigne][indColMoins]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursNE(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indColPlus=indColonne+1,indLigneMoins=indLigne-1;
		if(indColonne>=6||indLigne<=1||indLigne>7||indColonne<0) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLigneMoins][indColPlus]=='N'&&numJoueur==1) {
			while(indLigneMoins>0 && indColPlus<7 && tab[indLigneMoins][indColPlus]!='B') {
				indColPlus++;
				indLigneMoins--;
				if(tab[indLigneMoins][indColPlus]=='.') {
					return false;
				}
			}
			if( tab[indLigneMoins][indColPlus]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLigneMoins][indColPlus]=='B'&&numJoueur==2) {
			while(indLigneMoins>0 && indColPlus<7 &&tab[indLigneMoins][indColPlus]!='N') {
				indColPlus++;
				indLigneMoins--;
				if(tab[indLigneMoins][indColPlus]=='.') {
					return false;
				}
			}
			if(tab[indLigneMoins][indColPlus]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursSE(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indColPlus=indColonne+1,indLignePlus=indLigne+1;
		if(indColonne>=6|| indLigne>=6||indColonne<0||indLigne<0) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLignePlus][indColPlus]=='N'&&numJoueur==1) {
			while( indLignePlus <7 && indColPlus<7 && tab[indLignePlus][indColPlus]!='B') {
				indColPlus++;
				indLignePlus++;
				if(tab[indLignePlus][indColPlus]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColPlus]!='B') {
				return false;
			}
			return true;
		} 
		else if(tab[indLignePlus][indColPlus]=='B'&&numJoueur==2) {
			while( indLignePlus <7 && indColPlus<7 && tab[indLignePlus][indColPlus]!='N') {
				indColPlus++;
				indLignePlus++;
				if(tab[indLignePlus][indColPlus]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColPlus]!='N') {
				return false;
			}
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean parcoursSO(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indColMoins=indColonne-1,indLignePlus=indLigne+1;
		if(indLigne>=6||indColonne<=1||indLigne<0||indColonne>7) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLignePlus][indColMoins]=='N'&&numJoueur==1) {
			while(indLignePlus <=6 && indColMoins >0 && tab[indLignePlus][indColMoins]!='B') {
				indColMoins--;
				indLignePlus++;
				if(tab[indLignePlus][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColMoins]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLignePlus][indColMoins]=='B'&&numJoueur==2) {
			while(indLignePlus <=6 && indColMoins >0 && tab[indLignePlus][indColMoins]!='N') {
				indColMoins--;
				indLignePlus++;
				if(tab[indLignePlus][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLignePlus][indColMoins]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean parcoursNO(char[][]tab,int indLigne,int indColonne,int numJoueur) {
		int indLigneMoins=indLigne-1,indColMoins=indColonne-1;
		if(indLigne<=1||indLigne>7||indColonne<=1||indColonne>7) {
			return false;
		}
		if(tab[indLigne][indColonne]!='.') {
			return false;
		}
		if(tab[indLigneMoins][indColMoins]=='N'&&numJoueur==1) {
			while(indLigneMoins>0 && indLigneMoins >0 && tab[indLigneMoins][indColMoins]!='B') {
				indColMoins--;
				indLigneMoins--;
				if(tab[indLigneMoins][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLigneMoins][indColMoins]!='B') {
				return false;
			}
			return true;
		}else if(tab[indLigneMoins][indColMoins]=='B'&&numJoueur==2) {
			while(indColMoins >0 && indLigneMoins > 0 && tab[indLigneMoins][indColMoins]!='N') {
				indColMoins--;
				indLigneMoins--;
				if(tab[indLigneMoins][indColMoins]=='.') {
					return false;
				}
			}
			if(tab[indLigneMoins][indColMoins]!='N') {
				return false;
			}
			return true;
		}else {
			return false;
		}
	}
}
