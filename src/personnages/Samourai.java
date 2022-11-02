package personnages;

public class Samourai extends Ronin {

	private String seigneur;

	public Samourai(String nom, String boissonFavorite, int qteArgent, String seigneur) {
		super(nom, boissonFavorite, qteArgent);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur + ".");
	}

//	public void boire(String boisson) {
//		parler("Qu'est-ce que je vais choisir comme boisson ? "
//				+ "Tiens, je vais prendre " + boisson);
//	}
}
