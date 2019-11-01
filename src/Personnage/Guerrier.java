package Personnage;
import Comportement.*;

public class Guerrier extends Personnage {
	public Guerrier() {
	 this.arme = new CombatCouteau();
	 this.deplacement = new Courir();
	}
	
	public Guerrier(EspritCombatif arme, Soin soin , Deplacement deplacement) {
		super(arme,soin,deplacement);
	}
}
