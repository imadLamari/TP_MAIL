package com.parent.model;


/**
 * Classe qui represente un parent 
 * 
 * @author Imad LAMARI & Hichem BENDIA 
 * @version 1
 */
public class Parent
{
    // Le conjoint du parent
    private String conjoint;
    // Le nombres d'enfants du parent
    private int nombreEnfants;
    

    /**
     * Constructeur de la classe Parent
     */
    public Parent()
    {
        this.conjoint="";
        this.nombreEnfants=0;
    }
    /**
     * Constructeur de la classe Parent avec paramètres
     */
    public Parent(String conjoint, int nombreEnfants){
        this.setConjoint(conjoint);
        this.setNombreEnfants(nombreEnfants);
    
    }
    
    /**
     * acesseur pour la lecture de conjoint
     */
    public String getConjoint(){
        return this.conjoint;
    }
    /**
     * accessur pour l'écriture de conjoint
     */
    public void setConjoint(String conjoint){
        this.conjoint=conjoint;
    }
    
    /**
     * acesseur pour la lecture le nombre d'enfants
     */
    public int getNombreEnfants(){
        return this.nombreEnfants;
    }
    /**
     * accessur pour l'écriture du nombre d'enfants
     */
    public void setNombreEnfants(int nombreEnfants){
        this.nombreEnfants=nombreEnfants;
    }
    

    /**
     * Méthode qui donne la description du parent
     * 
     * @return a String variable description     
     */
    public String description()
    {
        // varaiable qui contient la description du parent
        String description="";
        // on concatène la description du parent à la varaible description
        description+="Mon conjoint est "+this.getConjoint()+" , et j'ai "+this.getNombreEnfants();
        //retourner la description
        return description;
    }
}
