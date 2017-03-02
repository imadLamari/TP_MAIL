package com.parent.model;


/**
 * Write a description of class Enfant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enfant
{
    // instance variables - replace the example below with your own
    private String nom;
   
    private String prenom;
    
    private Parent parent;

    /**
     * Constructor for objects of class Enfant
     */
    public Enfant()
    {
        // initialise instance variables
      this.nom="";
      this.prenom="";
      parent=null;
    }
    /**
     * Constructor for objects of class Enfant
     */
    public Enfant(String nom, String prenom, Parent parent)
    {
        // initialise instance variables
        setParent(parent);
        setNom(nom);
        setPrenom(prenom);
    }
    /**
     * 
     */
    public Parent getParent(){
       return this.parent;
    }
    /**
     * 
     */
    public void setParent(Parent parent){
       this.parent=parent;
    }
    /**
     * 
     */
    public String getPrenom(){
       return this.prenom;
    }
    /**
     * 
     */
    public void setPrenom(String prenom){
       this.prenom=prenom;
    }
    /**
     * 
     */
    public String getNom(){
       return this.nom;
    }
    /**
     * 
     */
    public void setNom(String nom){
       this.nom=nom;
    }
    /**
     * 
     */
    public String ficheFa(){
        String fiche="";
        fiche+="Je suis "+this.getPrenom()+" "+this.getNom()+", je viens d'une famille de "+
        this.getParent().getNombreEnfants()+" enfants";
        return fiche;
    }
}
