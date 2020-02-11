import java.util.Scanner;

public class Terre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jardin j1 = new Jardin(3,3);
		System.out.println(j1);
		
		j1.ajouterPanier("Ail", 10);
		j1.ajouterPanier("Bettrave", 10);
		j1.ajouterPanier("Carotte", 10);
		j1.ajouterPanier("Tomate", 10);
		
		System.out.println("Votre panier contient :");
        System.out.println("Ail = " + j1.getPanier().get("Ail") + " graine(s)");
        System.out.println("Bettrave = " + j1.getPanier().get("Bettrave") + " graine(s)");
        System.out.println("Carotte = " + j1.getPanier().get("Carotte") + " graine(s)");
        System.out.println("Tomate = " + j1.getPanier().get("Tomate") + " graine(s)\n");
		
        System.out.println("Choisissez une action :");
        System.out.println("1- Semer une graine");
        System.out.println("2- Récolter toutes les plantes matures");
        System.out.println("3- Passer à la saison suivante");
        System.out.println("4- Quitter l'application\n");
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        System.out.println(res);
        
        if(res==1) {
        	j1.Semer();
        }
        
        if(res==2) {
        	j1.Recolter();
        }
        
        if(res==3) {
        	j1.Saison();
        }
        
        if(res==4) {
        	j1.Exit();
        }
        
	}

}
