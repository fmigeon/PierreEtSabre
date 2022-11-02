package personnages;

public class Yakuza extends Humain {

	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int qteArgent, String clan) {
		super(nom, boissonFavorite, qteArgent);
		this.clan = clan;
	}
	
	public int getReputation () {
		return reputation ;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan + ".");
	}

	public void extorquer (Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas " + victime.getNom() + " qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie, donne-moi ta bourse !");
		final int qteExtorquee = victime.seFaireExtorquer();
		gagnerArgent(qteExtorquee);
		reputation ++;
		parler("J'ai piqué les " + qteExtorquee + " sous de " + victime.getNom()
				+ ", ce qui me fait "  + getQteArgent() + " sous dans ma poche."
				+ " Hi hi !");
		
	}
	
	public int perdre () {
		reputation--;
		final int fortune = getQteArgent();
		parler ("J'ai perdu  mon duel et mes " + fortune + " sous, snif..."
				+ "J'ai déshonoré le clan de " + clan);
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
