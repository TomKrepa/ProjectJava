import java.util.HashMap;

public class Jardin {
	
	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;
	
	public Jardin(int lon, int lar) {
		
		this.longueur = lon;
		this.largeur = lar;
		this.panier = new HashMap<String, Integer>();
		emplacement = new Emplacement[longueur][largeur];
	}

	
	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public HashMap<String, Integer> getPanier() {
		return panier;
	}

	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}
	
	public void ajouterPanier(String v, int q) {
		this.panier.put(v, q);
	}
	
	@Override
    public String toString() {
        String texte = "Voici votre jardin : \n";

        for(int x=0; x<longueur; x++) {
            for(int y=0; y<largeur; y++) {
                if(emplacement[x][y] == null)
                	{
                    	texte += 'o';
                	}
               	else
               		{
               			texte += 'u';
               		}
            	}
            texte += "\n";
        }

        return texte;
    }
	
	public void Semer() {
		
		System.out.println("Où voulez-vous semer une graine ?\n");
		
	}
	
	public void Recolter() {
		
		System.out.println("Plantes récoltées");
		
	}
	
	public void Saison() {
		
		System.out.println("Nouvelle Saion !");
		
	}
	
	public void Exit() {
		
		System.out.println("Au revoir !");
		
	}
}
        
       
    
