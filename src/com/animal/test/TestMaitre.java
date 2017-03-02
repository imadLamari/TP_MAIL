package com.animal.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.animal.model.Animal;
import com.animal.model.ComportementFelin;
import com.animal.model.Maitre;

public class TestMaitre {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAnimal() {
		Maitre maitre=new Maitre();
		assertEquals(maitre.getAnimal(), null);
	}

	@Test
	public void testGetNom() {
		Maitre maitre=new Maitre();
		assertEquals(maitre.getNom(), "");
	}
	
	@Test
	public void testConstructeurtMaitre() {
		String nom="eric";
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		Maitre maitre=new Maitre(animal,nom);
		assertEquals(nom,maitre.getNom());
		assertEquals(animal, maitre.getAnimal());
	}
	
	@Test
	public void testSetAnimal() {
		Maitre maitre=new Maitre();
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		maitre.setAnimal(animal);
		assertEquals(animal,maitre.getAnimal());
	}
	
	@Test
	public void testSetNom() {
		Maitre maitre=new Maitre();
		String nom="Eric";
		maitre.setNom(nom);
		assertEquals(nom,maitre.getNom());
	}
	
	@Test
    public void testAnimalDeCompagnie()
    {
		String nom="eric";
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		Maitre maitre=new Maitre(animal,nom);
        assertEquals(nom + " possede un(e)"+animal.getRace()+", qui se nomme" + animal.getNom(), 
        		maitre.animalDeCompagnie());
    }

    @Test 
    public void testAdopter(){
    	String nom="Eric";
    	Animal animal=new Animal("chat", "fillou",new ComportementFelin()); 
    	Maitre maitre=new Maitre(animal, nom);
    	maitre.adopter(animal);
    	assertEquals(animal, maitre.getAnimal());
    }
}
