package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.perdreArgent(12);
		prof.boire();
		prof.gagnerArgent(20);
		
		Commercant marchand = new Commercant("Marchand", "thé", 20);
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoir(15);
		marchand.boire();
		
		Yakuza leNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		leNoir.direBonjour();
		leNoir.extorquer(marchand);
		
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
		roro.donner(marchand);
	}

}
