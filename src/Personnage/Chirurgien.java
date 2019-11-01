package Personnage;
import Comportement.*;

public class Chirurgien extends Personnage {
	
	public Chirurgien() {
		this.soin = new Operation();
		this.arme = new CombatCouteau();
	}
	
	public Chirurgien(EspritCombatif arme, Soin soin , Deplacement deplacement) {
		super(arme,soin,deplacement);
	}

}
