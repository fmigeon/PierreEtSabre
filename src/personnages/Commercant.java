package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int qteArgent) {
		super(nom, boissonFavorite, qteArgent);
	}

	public int seFaireExtorquer() {
		final int qteExtorquee = getQteArgent();
		perdreArgent(qteExtorquee);
		parler("J'ai tout perdu ! Le monde est vraiment trop injuste :-(");
		return qteExtorquee;
	}
	
	public void recevoir (int argent) {
		gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donateur !");
	}
}
