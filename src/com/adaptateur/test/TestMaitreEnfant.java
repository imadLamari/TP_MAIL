package com.adaptateur.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.adaptateur.model.MaitreEnfant;
import com.adaptateur.model.MaitreParent;
import com.animal.model.Animal;
import com.animal.model.ComportementFelin;
import com.parent.model.Enfant;
import com.parent.model.Parent;

public class TestMaitreEnfant {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMaitreEnfantGetEnfant() {
		MaitreEnfant me=new MaitreEnfant();
		assertNull(me.getEnfant());
	}
	
	@Test
	public void testMaitreEnfantConst() {
		String nom="lerouge";
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		Enfant enfant=new  Enfant(nom,"jack" , new Parent("marie", 4));
		MaitreEnfant maitreEnfant=new MaitreEnfant(enfant,nom,animal);
		assertNotNull(maitreEnfant);
		assertEquals(enfant, maitreEnfant.getEnfant());
	}
	
	
	@Test
	public void testMaitreEnfantSetEnfant() {
		MaitreEnfant me=new MaitreEnfant();
		Enfant enfant=new  Enfant("lerouge","jack" , new Parent("marie", 4));
		me.setEnfant(enfant);
		assertEquals(enfant, me.getEnfant());
	}
	
	@Test
	public void testMaitreParentAnimalDeCompagnie() {
		
		String nom="lerouge";
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		Enfant enfant=new  Enfant(nom,"jack" , new Parent("marie", 4));
		MaitreEnfant maitreEnfant=new MaitreEnfant(enfant,nom,animal);
		assertEquals(nom + " a reçu un "+animal.getRace()+", qui se nomme" + animal.getNom()+" de ses parents",
				maitreEnfant.animalDeCompagnie());	
	}

}
