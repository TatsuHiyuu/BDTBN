package batailleNavale;

public class GrilleNavale {
	
	/* La classe GrilleNavale represente une grille de bataille navale.
	 * Les attributs navires et nbNavires repr�sentent les navires places sur la grille ainsi que leur nombre.
	 * L'attribut taille donne la taille de la grille (la grille est de forme carr�e). Les tirsRecus et nbTirsRecus referencent les coordonnees o� des tirs ont ete effectu�s ainsi que leur nombre.
	 * */
	 
	private Navire[] navires;
	private int nbNavire;
	private int tailleGrille;
	private Coordonnee[] tirsRecus;
	private int nbTirsRecus;
	
	public GrilleNavale(int taille, int[] taillesNavires) {}
	public GrilleNavale(int taille) {}
	//public boolean ajouteNavire(Navire n) {}
	public void placementAuto(int[] taillesNavires) {}
	//private boolean estDansGrille(Coordonnee c) {}
	//private boolean estDansTirsRecus(Coordonnee c) {}
	//public boolean ajouteDansTirsRecus(Coordonnee c) {}
	//public boolean recoitTir(Coordonnee c) {}
	//public boolean estTouche(Coordonnee c) {}
	//public boolean estALEau(Coordonnee c) {}
	//public boolean estCoule(Coordonnee c) {}
	//public boolean perdu() {}

	//// Main pour terster les diff�rentes m�thodes	////
	public static void main(String[] args) {

	}

}