package OthelloPack;

public class rules {
	public static void RegleDuJeu() {
		System.out.println("Othello se joue à 2, sur un plateau unicolore de 64 cases (8 sur 8), avec des pions bicolores, noirs d'un côté et blancs de l'autre.\n"
				+ "Le but du jeu est d'avoir plus de pions de sa couleur que l'adversaire à la fin de la partie, celle-ci s'achevant lorsque aucun des deux joueurs ne peut plus jouer de coup légal, généralement lorsque les 64 cases sont occupées.\n"
				+ "Chacun à son tour, les joueurs vont poser un pion de leur couleur sur une case vide, adjacente à un pion adverse. Chaque pion posé doit obligatoirement encadrer un ou plusieurs pions adverses avec un autre pion de sa couleur, déjà placé.\n"
				+ "Il retourne alors le ou les pions adverse(s) qu'il vient d'encadrer. Les pions ne sont ni retirés de l'othellier, ni déplacés d’une case à l’autre. On peut encadrer des pions adverses dans les 8 directions et plusieurs pions peuvent être encadrés dans chaque direction.");
	}
}
