package com.parent.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.parent.model.Parent;

public class TestParent {

	@Before
	public void setUp() throws Exception {
	}
	
	@After
	public void tearDown() throws Exception {
	}
	/**
	 * Test la méthode getConjoint
	 */
	@Test
	public void testGetConjoint() {
		Parent p=new Parent();
		assertTrue(p.getConjoint().equals(""));
	}
	/**
	 * Test la méthode getNbEnfants
	 */
	@Test
	public void testGetNbEnfants() {
		Parent p=new Parent();
		assertTrue(p.getNombreEnfants()==0);
	}
	/**
	 * Test le constructeur
	 */
	@Test
	public void testNewParents() {
		Parent p=new Parent("Sarra",4);
		assertTrue(p.getNombreEnfants()==4 && p.getConjoint().equals("Sarra"));
	}
	/**
	 * Test la méthode setConjoint
	 */
	@Test
	public void testSetConjoint(){
		Parent p=new Parent();
		p.setConjoint("Sarra");
		assertTrue(p.getConjoint().equals("Sarra"));
	}
	/**
	 * Test la méthode setNombreEnfants
	 */
	@Test
	public void testSetNombreEnfants(){
		Parent p=new Parent();
		p.setNombreEnfants(4);
		assertTrue(p.getNombreEnfants()==4); 
	}	
	
	@Test
	public void testDescription(){
		Parent p=new Parent("Marie", 4);
		assertTrue(p.description().equals("Mon conjoint est "+
		p.getConjoint()+" , et j'ai "+p.getNombreEnfants()));
	}
}
