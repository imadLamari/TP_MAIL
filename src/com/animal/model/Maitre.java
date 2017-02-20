package com.animal.model;


/**
 * Write a description of class Maître here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maitre
{
    // instance variables - replace the example below with your own
    protected Animal animal;
    protected String nom;

    /**
     * Constructor for objects of class Maître
     */
    public Maitre()
    {
        // initialise instance variables
        this.nom="TOTO";
        
    }

    
    public Maitre(Animal animal, String nom) {
		super();
		this.animal = animal;
		this.nom = nom;
	}


	/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   /* public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }*/
    
    public void setNom( String nom)
    {
        this.nom=nom;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
     public void setAnimal( Animal animal)
    {
        this.animal=animal;
    }
    
    public Animal getAnimal()
    {
        return this.animal;
    }
    
    public String animalDeCompagnie()
    {
        return this.nom + " est le maitre de " + this.animal.getNom();
    }
    
    public void adopter(){
      System.out.println( "je suis "+this.nom+", je poss�de un "+
    		  				this.animal.getRace()+", son nom est "+
    		  				this.animal.getNom());
    }
}
