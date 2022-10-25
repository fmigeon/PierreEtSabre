package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonFavorite, int qteArgent) {
		super(nom, boissonFavorite, qteArgent);
	}

	public void seFaireExtorquer() {
		perdreArgent(getQteArgent());
		parler("Le monde est vraiment trop injuste :-(");
	}
	
	public void recevoir (int argent) {
		gagnerArgent(argent);
		parler("Je te remercie généreux donateur !");
	}
}
