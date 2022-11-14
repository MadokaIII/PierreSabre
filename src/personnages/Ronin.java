package personnages;

public class Ronin extends Humain {

	private int honneur;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		int donnation = argent / 10;
		parler("Marco prends ces " + donnation + " sous.");
		perdreArgent(donnation);
		beneficiaire.recevoir(donnation);
	}

	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		if (force >= adversaire.getReputation()) {
			honneur++;
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
			parler("Je t’ai eu petit yakusa !");
			gagnerArgent(adversaire.perdre());
		} 
		else {
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argent);
			perdreArgent(argent);
		}
	}

}
