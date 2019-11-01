package Personnage;
import Comportement.*;

public class Civil extends Personnage {
	
	public Civil() {
		
	}
	
	public Civil(EspritCombatif arme, Soin soin , Deplacement deplacement) {
		super(arme,soin,deplacement);
	}
	
}
