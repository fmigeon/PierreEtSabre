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
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand ! ");
		final int force = honneur * 2;
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai eu petit yakusa ! ");
			final int gain = adversaire.perdre();
			honneur++;
		} else {
			decrHonneur();
			final int monArgent = getQteArgent();
			perdreArgent(monArgent);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");		
			adversaire.gagner(monArgent);
		}
	}

	private void decrHonneur() {
		honneur = honneur > 0 ? honneur - 1 : 0;
	}
}
