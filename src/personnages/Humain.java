package personnages;

public class Humain {

	private static final int TAILLE_MEMOIRE = 50;

	private String nom;
	private String boissonFavorite;
	private int qteArgent;

	protected Humain[] memoire = new Humain[TAILLE_MEMOIRE];
	private int nbConnaissances = 0;

	public Humain(String nom, String boissonFavorite, int qteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.qteArgent = qteArgent;
	}

	public String getNom() {
		return nom;
	}

	public int getQteArgent() {
		return qteArgent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (qteArgent >= prix) {
			parler("J'ai " + getQteArgent() + " sous en poche. "
					+ "Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + qteArgent + " sous en poche."
					+ "Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");

		}
	}

	public void faireConnaissance(Humain nouvelleConnaissance) {
		direBonjour();
		nouvelleConnaissance.repondre(this);
		memoriser(nouvelleConnaissance);
	}
	
	public void listerConnaissances() {
		String listeNoms = "";
		
		for (int i = 0; i < nbConnaissances; i++) {
			listeNoms += memoire[i].getNom() + ", ";
		}
		final int longueurListe = listeNoms.length();
		if (longueurListe  > 2) {
			parler("Je connais beaucoup de monde dont : " +  listeNoms.substring(0, longueurListe-2) );
		} else {
			parler("Je n'ai pas de connaissances.");
		}
	}

	private void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
	}

	protected void memoriser(Humain autreHumain) {
		if (nbConnaissances == TAILLE_MEMOIRE) {
			effacerLaPremiereConnaissanceEtDecalerVersLaGauche();
		}
		memoire[nbConnaissances++] = autreHumain;
	}

	private void effacerLaPremiereConnaissanceEtDecalerVersLaGauche() {
		for (int i = 0; i < TAILLE_MEMOIRE - 1; i++) {
			memoire[i] = memoire[i + 1];
		}
		nbConnaissances--;
	}

	protected void gagnerArgent(int gain) {
		qteArgent += gain;
	}

	protected void perdreArgent(int perte) {
		qteArgent -= perte;
	}

	protected void parler(String texte) {
		System.out.println("(" + getNom() + ") - " + texte);
	}

	protected int getNbConnaissances() {
		return nbConnaissances;
	}

}
