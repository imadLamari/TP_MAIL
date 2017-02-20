package com.animal.model;

import com.parent.model.Enfant;
import com.parent.model.Parent;

public class MaitreParent extends Maitre {
	
	private Parent parent;
	
	public MaitreParent() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the parent
	 */
	public Parent getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	
	public MaitreParent(Animal animal, String nom,String conjoint) {
		super(animal,nom);
		this.setParent(new Parent(conjoint,0)); 
	}
	
	
	public void adopter(){
		System.out.println( "je suis "+this.nom+" "+this.parent.description()+
				", je possède un "+ this.animal.getRace()+", son nom est "+ this.animal.getNom());
	}

}
