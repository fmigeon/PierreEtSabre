package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 4;

	public Yakuza(String nom, String boissonFavorite, int qteArgent, String clan) {
		super(nom, boissonFavorite, qteArgent);
		this.clan = clan;
	}
	
	public int getReputation () {
		return reputation ;
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
	
	public int perdre () {
		reputation--;
		int fortune = getQteArgent();
		parler ("J'ai perdu  mon duel et mes " + fortune + " sous, snif..."
				+ "J'ai déshonoré le clan des " + clan);
		perdreArgent(fortune);
		return fortune;
	}
	
	public void gagner (int gain) {
		reputation++;
		gagnerArgent(gain);
		parler("Ce ronin pensait vrament battre " + getNom() + " du clan de " + clan + " ? "
				+ "Je l'ai dépouillé de ces " +  gain + " sous.");
	}
}
