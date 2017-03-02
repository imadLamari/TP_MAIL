package com.adaptateur.model;

import com.animal.model.Animal;
import com.animal.model.Maitre;
import com.parent.model.Enfant;
import com.parent.model.Parent;

public class MaitreEnfant extends Maitre {

	private Enfant enfant;
	
	/**
	 * @return the enfant
	 */
	public Enfant getEnfant() {
		return enfant;
	}

	
	public MaitreEnfant(){
		this.enfant=null;
	}
	
	/**
	 * @param enfant the enfant to set
	 */
	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}
 
	public MaitreEnfant(Enfant enfant,String nom ,Animal animal) {
		super(animal,nom);
		this.enfant=enfant;
	}
	
	
	public String animalDeCompagnie()
    {
       return this.nom + " a reçu un "+this.animal.getRace()+", qui se nomme" + this.animal.getNom()+" de ses parents";
    }
	
}
