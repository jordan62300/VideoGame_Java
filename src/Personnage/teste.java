package Personnage;
import Comportement.*;

public class teste {

	public static void main(String[] args) {
		Personnage[] personnages = {new Guerrier() , new Civil() , new Medecin() };
		
		for(int i = 0 ; i < personnages.length ; i++) {
			System.out.println("\nInstance de " + personnages[i].getClass().getName());
			System.out.println("*****************************************************");
			personnages[i].combattre();
			personnages[i].soin();
			personnages[i].deplacement();
		}
	}

}
