package com.parent.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.parent.model.Enfant;
import com.parent.model.Parent;

public class TestEnfant {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEnfantInstVide() {
		Enfant e=new Enfant();
		assertNotNull(e);
	}
	
	@Test
	public void testEnfantGetNom() {
		Enfant e=new Enfant();
		assertTrue(e.getNom().equals(""));
	}
	
	@Test
	public void testEnfantGetPrenom() {
		Enfant e=new Enfant();
		assertTrue(e.getPrenom().equals(""));
	}
	

	@Test
	public void testEnfantConstArg() 
	{
		Parent p=new Parent("Marie",4);
		Enfant e=new Enfant("eric","jean",p);
		assertTrue(e.getNom().equals("eric"));
		assertTrue(e.getPrenom().equals("jean"));
		assertTrue(e.getParent().equals(p));
	}
	
	@Test
	public void testFicheEnfant() 
	{
		Parent p=new Parent("Marie",4);
		Enfant e=new Enfant("eric","jean",p);
		assertTrue(e.ficheFa().equals("Je suis "+e.getPrenom()+" "+e.getNom()+", je viens d'une famille de "+
        e.getParent().getNombreEnfants()+" enfants"));
	}
}
