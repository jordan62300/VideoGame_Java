package Personnage;
import Comportement.*;

public class Medecin extends Personnage {
	
	public Medecin() {
		this.soin = new PremierSoin();
	}
	
	public Medecin(EspritCombatif arme, Soin soin , Deplacement deplacement) {
		super(arme,soin,deplacement);
	}

}
