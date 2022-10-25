package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int qteArgent, String clan) {
		super(nom, boissonFavorite, qteArgent);
		this.clan = clan;
	}

	public void extorquer (Commercant cible) {
		parler("Tiens, tiens, ne serait-ce pas " + cible.getNom() + " qui passe par là ?");
		final int qteExtorquee = cible.seFaireExtorquer();
		gagnerArgent(qteExtorquee);
		reputation ++;
		parler("J'ai piqué les " + qteExtorquee + " sous de " + cible.getNom()
				+ ", ce qui me fait "  + getQteArgent() + " sous dans ma poche."
				+ " Hi hi hi, il ne s'est aperçu de rien !");
		
	}
}
