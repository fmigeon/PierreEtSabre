package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco =  new Commercant("Marco", 20);
		Commercant chonin =  new Commercant("Chonin", 40);
		Commercant kumi =  new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60); 

		marco.faireConnaissance(roro);
		marco.faireConnaissance(yaku);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(kumi);
		
		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
		
		Humain akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissances();
//		akimoto.boire("du thé");
		
		Traitre masako = new Traitre("Masako", "whisky", 100, "Miyamoto");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissance(masako);
		masako.ranconner(kumi);
		masako.faireConnaissance(yaku);
		masako.faireLeGentil();
		masako.faireConnaissance(roro);

		Samourai akira = new Traitre("Akira", "whisky", 50, "Miyamoto");
		Ronin hiro = new Traitre("Hiro", "saké", 20, "Miyamoto");
		Humain nori = new Traitre("Nori", "whisky", 70, "Miyamoto");
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissance(akimoto);
		grandMere.faireConnaissance(yaku);
		grandMere.faireConnaissance(masako);
		grandMere.faireConnaissance(kumi);
		grandMere.faireConnaissance(marco);
		grandMere.faireConnaissance(chonin);
		grandMere.ragoter();


	}

}
