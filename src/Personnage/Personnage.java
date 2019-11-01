package Personnage;

import Comportement.*;

public class Personnage {
	
	
	// Attributs
	
	protected EspritCombatif arme = new Pacifism();
	protected Soin soin = new AucunSoin();
	protected Deplacement deplacement = new Marcher();
	
	// Default Constructor
	
	public Personnage() {
		
	}
	
	public Personnage(EspritCombatif arme , Soin soin , Deplacement deplacement) {
		this.arme =  arme;
		this.soin = soin;
		this.deplacement = deplacement;
	}
	
	// Methods comportement
	
	public void combattre() {
		arme.combat();
	}
	
	public void deplacement() {
		deplacement.deplacement();
	}
	
	public void soin() {
		soin.soin();
	}
	
	public void setArme(EspritCombatif arme) {
		this.arme = arme;
	}
	
	public void setSoin(Soin soin) {
		this.soin = soin;
	}
	
	public void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}

}
