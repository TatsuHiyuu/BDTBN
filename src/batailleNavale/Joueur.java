package batailleNavale;

public abstract class Joueur {
	public final static int TOUCHE=1;
	public final static int COULE=2;
	public final static int A_L_EAU=3;
	private Joueur adversaire;
	private GrilleNavale grille;
	private String nom;
	
	/// Constructeur
	public Joueur(GrilleNavale g, String nom) {
		this.grille = g;
		this.nom = nom;
	}
	
	/// M�thodes
	public GrilleNavale getGrille() {
		return(this.grille);
	}
	
	public GrilleNavale getGrilleAdversaire() {
		return(adversaire.grille);
	}
	
	public String getNom() {
		return(this.nom);
	}
		
	public void jouerAvec(Joueur j) {	// Constructeur de l'adversaire
		this.adversaire = j;
		j.adversaire = this;
	}
	
	public boolean defense(Coordonnee c) {
		int etat = 0;
		this.grille.recoitTir(c);	// tir c pris en compte sur la grille de this
		if(this.grille.perdu()) {	// v�rifier que �a appelle bien navure.estTouche/Coule(c) > GrilleNavale.perdu()
			this.perdu();
			this.adversaire.gagne();
			return false;
		}
		if(this.grille.estTouche(c)) {
			if(this.grille.estCoule(c))
				etat = COULE;
			else
				etat = TOUCHE;
		}
		else
			etat = A_L_EAU;
		this.retourDefense(c, etat);
		adversaire.retourAttaque(c, etat);
		return true;
	}
	
	public void attaque(Coordonnee c) {
		if (adversaire.defense(c)) {
			adversaire.debutAttaque();
		}
	}
	
	protected String resultatAttaque(int etat) {
		String resultatAttaque = "";
		switch(etat) {
			case 1 : resultatAttaque = " touche un navire adverse !"; break;
			case 2 : resultatAttaque = " coule un navire adverse !"; break;
			case 3 : resultatAttaque = " tombe � l'eau !"; break;
		}
		return resultatAttaque;
	}
	
	/// M�thodes abstraites
	protected abstract void perdu();	// invoqu� lorsque this a perdu la partie. Agit sur l'interface.
	protected abstract void gagne();	// invoqu� lorsque this a gagn� la partie. Agit sur l'interface.
	protected abstract void retourAttaque(Coordonnee c, int etat);	// donne le droit d'attaquer � l'autre.
	protected abstract void retourDefense(Coordonnee c, int etat);	// donne le droit de d�fendre � l'autre.
	public abstract void debutAttaque();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
