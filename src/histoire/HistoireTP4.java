package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.perdreArgent(12);
		prof.boire();
		prof.gagnerArgent(20);
	}

}
