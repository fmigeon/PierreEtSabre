package personnages;

import java.util.Random;

public class GrandMere extends Humain {

	private static final int TAILLE_MEMOIRE_GM = 5;
	private static enum Personnage {
		COMMERCANT("un commerçant"),RONIN("un ronin"), GRAND_MERE("une grand-mère"),
		SAMOURAI("un samourai"), YAKUZA("un yakuza"), HABITANT("un  habitant");
		
		private String label;
		private Personnage(String label) {
			this.label  = label;
		}
	}
	private Random pioche  = new Random();

	public GrandMere(String nom, int qteArgent) {
		super(nom, "tisane", qteArgent);
		memoire = new Humain[TAILLE_MEMOIRE_GM];
	}

	@Override
	protected void memoriser(Humain autreHumain) {
		if (getNbConnaissances() < TAILLE_MEMOIRE_GM) {
				super.memoriser(autreHumain);
		} else {
			parler ("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	public void ragoter() {
		for (int i = 0; i < getNbConnaissances(); i++) {
			Humain humain = memoire[i];
			String nomHumain = humain.getNom();
			if( humain instanceof Traitre) {
				parler("Je sais que " + nomHumain + " est un traître. Petit chenapan !" );
			} else {
				parler("Je crois que " + nomHumain + " est " + humainHasard());
			}
		}
	}
	private String humainHasard() {
		String resultat  = "";
		int nombreAleatoire = pioche.nextInt(Personnage.values().length);
		resultat = Personnage.values()[nombreAleatoire].label;
		return resultat;
	}
	
//	private String humainHasard() {
//		String resultat  = "";
//		int nombreAleatoire = pioche.nextInt(6);
//		switch (nombreAleatoire) {
//		case 0:
//			resultat = "un commerçant";
//			break;
//		case 1:
//			resultat = "un samouraï";
//			break;
//
//		case 2:
//			resultat = "un yakuza";
//			break;
//
//		case 3:
//			resultat = "un ronin";
//			break;
//		case 4:
//			resultat = "une grand-mère";
//			break;
//		default:
//			resultat = "un habitant";
//			break;
//		}
//		return resultat;
//	}
}
