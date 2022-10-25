package personnages;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	private int qteArgent;
	
	public Humain(String nom, String boissonFavorite, int qteArgent) {
		super();
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
		parler("Bonjour ! Je m'appelle " + getNom() 
				+ " et j'aime boire du " + boissonFavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		parler("J'ai " + getQteArgent() + " sous en poche. " +
				"Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
		perdreArgent(prix);
	}
	
	protected void gagnerArgent (int gain) {
		qteArgent += gain;
	}
	
	protected void perdreArgent (int perte) {
		qteArgent -= perte;
	}
	
	protected void parler (String texte) {
		System.out.println("("  + getNom() + ") - " + texte);
	}
	

}
