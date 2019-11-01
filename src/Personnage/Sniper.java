package Personnage;
import Comportement.*;

public class Sniper extends Personnage {
	
	public Sniper() {
		this.arme = new CombatPistolet();
		this.deplacement = new Courir();
	}
	
	public Sniper(EspritCombatif arme, Soin soin , Deplacement deplacement) {
		super(arme,soin,deplacement);
	}
	
}
