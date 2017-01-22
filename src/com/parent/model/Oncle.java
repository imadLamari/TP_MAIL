package com.parent.model;

import java.util.ArrayList;
import java.util.Collections;

public class Oncle {

	//le nom
	private String nom;
	//le prénom
	private String prenom;
	//la liste des neveux
	private ArrayList<Parent> neveux; 
	
	//Constructeur de la classe Oncle
	public Oncle(){
		this.neveux=new ArrayList<Parent>();
		this.nom="";
		this.prenom="";
	}
	
	public Oncle(String nom, String prenom, ArrayList<Parent> neveux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.neveux = neveux;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the neveux
	 */
	public ArrayList<Parent> getNeveux() {
		return neveux;
	}

	/**
	 * @param neveux the neveux to set
	 */
	public void setNeveux(ArrayList<Parent> neveux) {
		this.neveux = neveux;
	}
	
}
