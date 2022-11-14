package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {

		Commercant marco = new Commercant("Marco",15);
		marco.direBonjour();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky",30,"Hizanagi");
 		yaku.direBonjour();
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.direBonjour();
 		yaku.direBonjour();
 		yaku.extorquer(marco);
		roro.provoquer(yaku);
		roro.donner(marco);

	}

}
