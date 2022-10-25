package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int qteArgent, String clan) {
		super(nom, boissonFavorite, qteArgent);
		this.clan = clan;
	}

	public void extorquer (Commercant cible) {
		final int qteExtorquee = cible.seFaireExtorquer();
		gagnerArgent(qteExtorquee);
		reputation ++;
		parler("J'ai piqué les " + qteExtorquee + " de " + cible.getNom()
				+ ", ce qui me fait "  + getQteArgent()
				+ " sous dans ma poche. Hi hi hi, il ne s'est aperçu de rien !");
		
	}
}
