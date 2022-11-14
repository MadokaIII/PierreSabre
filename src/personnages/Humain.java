package personnages;

public class Humain {

	private String nom;
	private String boisson;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[3];

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boisson + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	public void acheter(String bien, int prix) {
		if (prix <= argent) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix
					+ " sous.");
		}
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance == 3) {
			for (int i = 1; i < nbConnaissance; i++) {
				memoire[i-1] = memoire[i];
			}
			memoire[nbConnaissance-1] = humain;
		} else {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		StringBuilder texte = new StringBuilder();
		texte.append("Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			if (i == nbConnaissance-1) {
				texte.append(memoire[i].getNom()+".");
			} else {
				texte.append(memoire[i].getNom()+", ");
			}
		}
		parler(texte.toString());
	}
	
}
