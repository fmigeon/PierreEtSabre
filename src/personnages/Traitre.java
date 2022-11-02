package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0;
	private Random pioche = new Random();

	public Traitre(String nom, String boissonFavorite, int qteArgent, String seigneur) {
		super(nom, boissonFavorite, qteArgent, seigneur);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est " + niveauTraitrise + ". Chut !");
	}

	public void faireLeGentil() {
		if (getNbConnaissances() < 1) {
			parler("Je ne peux pas faire ami ami avec qui que ce soit car je ne connais personne ! Snif.");
		} else {			
			final Humain ami = memoire[pioche.nextInt(getNbConnaissances())];
			final int don = getQteArgent() / 20;
			parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + ami.getNom() + " .");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");
		}
		niveauTraitrise -= niveauTraitrise>1 ? 1 : 0;
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			final int argentCommercant = commercant.getQteArgent();
			final int argentARanconner = argentCommercant * 2 / 10;
			commercant.perdreArgent(argentARanconner);
			gagnerArgent(argentARanconner);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !\n"
					+ "Donne-moi " + argentARanconner + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + getNom() + ".");
		} else {
			parler("Mince, je ne peux plus rançonner qui que ce soit sinon un samouraï risque de me démasquer !");
		}
	}
}
