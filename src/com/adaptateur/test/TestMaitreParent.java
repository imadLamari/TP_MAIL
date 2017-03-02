package com.adaptateur.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.adaptateur.model.MaitreEnfant;
import com.adaptateur.model.MaitreParent;
import com.animal.model.Animal;
import com.animal.model.ComportementFelin;
import com.parent.model.Parent;

public class TestMaitreParent {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testMaitreParentGetParent() {
		MaitreParent mp=new MaitreParent();
		assertNull(mp.getParent());
	}

	@Test
	public void testMaitreParenttConst() {
		MaitreParent mp=new MaitreParent();
		assertNotNull(mp);
		assertNull(mp.getParent());
	}
	
	@Test
	public void testMaitreParentSetParent() {
		
		MaitreParent mp=new MaitreParent();
		assertNull(mp.getParent());
	}
	
	
	@Test
	public void testMaitreParentAnimalDeCompagnie() {
		
		Animal animal=new Animal("chat", "toto", new ComportementFelin());
		Parent parent=new Parent("marie", 2);
		String nom="fred";
		MaitreParent pe=new MaitreParent(nom,parent,animal);
		assertEquals(nom + " a ramené un "+animal.getRace()+", qui se nomme" + animal.getNom()+" pour son enfant",
				pe.animalDeCompagnie());
	}
	
	
	

}
