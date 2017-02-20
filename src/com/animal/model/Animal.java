package com.animal.model;



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

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        this.nom="tom";
        this.race="chat";
        
    }
    
    

    public Animal(String race, String nom) {
		super();
		this.race = race;
		this.nom = nom;
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
    public void informationAnimal()
    {
        System.out.println (this.nom + " est un " + this.race);
        
    }
}
