package personnages;

public class Ronin extends Humain {

	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int qteArgent) {
		super(nom, boissonFavorite, qteArgent);
	}
	
	public void donner (Commercant beneficiaire) {
		int don = getQteArgent()/10;
		perdreArgent(don);
		parler(getNom() + ", prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
