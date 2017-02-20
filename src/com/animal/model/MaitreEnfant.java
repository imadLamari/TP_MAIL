package com.animal.model;

import com.parent.model.Enfant;

public class MaitreEnfant extends Maitre {

	private Enfant enfant;
	
	/**
	 * @return the enfant
	 */
	public Enfant getEnfant() {
		return enfant;
	}

	
	/**
	 * @param enfant the enfant to set
	 */
	public void setEnfant(Enfant enfant) {
		this.enfant = enfant;
	}
 
	public MaitreEnfant(Animal animal, String nom,String prenom) {
		super(animal,nom);
		this.setEnfant(new Enfant(nom, prenom, null));
	}
	
	
	public void adopter(){
		System.out.println( "je suis une enfant je m'appelle "+this.enfant.getNom()+" "+this.enfant.getPrenom()+
				", je possède un "+ this.animal.getRace()+", son nom est "+ this.animal.getNom());
	}
	
}
