package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {

		Yakuza yaku = new Yakuza("Yaku le Noir", "whisky", 45, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 54);
		roro.provoquer(yaku);

	}

}
