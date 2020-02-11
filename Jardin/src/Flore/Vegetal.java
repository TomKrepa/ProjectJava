package Flore;

public abstract class Vegetal {
	
	protected Etat etat;
	protected char dessin[];
	
	public Vegetal() {
		
		dessin = new char[6];
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = '|';
		dessin[5] = '#';
		
		this.etat = Etat.GRAINE;
	}
	
}
