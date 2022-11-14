package personnages;

public class Yakuza extends Humain {

	String clan;
	private int reputation;

	public int getReputation() {
		return reputation;
	}

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 4;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int bourse = victime.seFaireExtorquer();
		victime.perdreArgent(bourse);
		gagnerArgent(bourse);
		reputation++;
		parler("J’ai piqué les " + bourse + " sous de " + victime.getNom() + ", ce qui me fait " + argent
				+ " sous dans ma poche. Hi ! Hi !");
	}

	public int perdre() {
		int total = argent;
		perdreArgent(argent);
		reputation--;
		parler("J’ai perdu mon duel et mes " + total + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		return total;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain
				+ " sous.");
	}
}
