package personnages;

public class Yakuza extends Humain {
	
	String clan;
	int reputation;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler( victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int bourse = victime.seFaireExtorquer();
		victime.perdreArgent(bourse);
		gagnerArgent(bourse);
		reputation++;
		parler("J’ai piqué les " + bourse + " sous de " + victime.getNom() + ", ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
	
}
