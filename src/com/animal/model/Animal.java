package com.animal.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal
{


	// instance variables - replace the example below with your own
    private String race;
    private String nom;
    private IComportement comportement; 

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        this.nom="";
        this.race="";
        this.comportement=null;
    }
    
    

    public Animal(String race, String nom, IComportement comportement) {
		super();
		this.race = race;
		this.nom = nom;
		this.comportement=comportement;
	}



	/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNom()
    {
        return this.nom;
    }
    
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public String getRace()
    {
        return this.race;
    }
    
    public void setRace(String race)
    {
        this.race=race;
    }
    
    /**
	 * @return the comporetement
	 */
	public IComportement getComportement() {
		return comportement;
	}

	/**
	 * @param comporetement the comporetement to set
	 */
	public void setComportement(IComportement comporetement) {
		this.comportement = comporetement;
	}
    
    
    public void informationAnimal()
    {
    	Logger logger = Logger.getLogger("log");
		logger.log(Level.SEVERE, this.nom + " est un " + this.race, new RuntimeException("Error"));
    }
}
