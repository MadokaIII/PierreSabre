package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco",54);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky",40,"Hizanagi");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
	}

}
