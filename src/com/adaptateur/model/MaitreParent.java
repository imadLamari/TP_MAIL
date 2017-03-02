package com.adaptateur.model;

import com.animal.model.Animal;
import com.animal.model.Maitre;
import com.parent.model.Enfant;
import com.parent.model.Parent;

public class MaitreParent extends Maitre {
	
	private Parent parent;
	
	public MaitreParent() {
		// TODO Auto-generated constructor stub
		parent=null;
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

	public MaitreParent(String nom,Parent parent,Animal animal) {
		super(animal,nom);
		this.parent=parent; 
	}
	
	
	public void adopter(){
		System.out.println( "je suis "+this.nom+" "+this.parent.description()+
				", je possède un "+ this.animal.getRace()+", son nom est "+ this.animal.getNom());
	}
	
	public String animalDeCompagnie()
    {
       return this.nom + " a ramené un "+this.animal.getRace()+", qui se nomme" + this.animal.getNom()+" pour son enfant";
    }

}
