package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, "", argent);
		this.boisson = "thé";
	}

	public void seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		argent = 0;
	}
	
	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		this.argent += argent;
	}
	
}
