/**
 * 
 */
package com.parent.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.parent.model.Oncle;
import com.parent.model.Parent;

/**
 * @author imad
 *
 */
public class OncleTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}
	/**
	 * test la méthode getNom
	 */
	@Test
	public void testGetNom(){
		Oncle oncle=new Oncle();
		assertTrue(oncle.getNom().equals(""));
	}
	/**
	 * test la méthode getPrenom
	 */
	@Test
	public void testGetPrenom(){
		Oncle oncle=new Oncle();
		assertTrue(oncle.getPrenom().equals(""));
	}
	/**
	 * Test method for {@link com.parent.model.Oncle#getParents()}.
	 */
	@Test
	public void testGetNeuveux() {
		Oncle oncle=new Oncle();
		
		assertNotNull(oncle.getNeveux());
		assertEquals(oncle.getNeveux().size(),0 );
	}
	/**
	 * Test method for {@link com.parent.model.Oncle#Oncle(java.util.ArrayList)}.
	 */
	@Test
	public void testNewOncle() {
		Parent martin=new Parent("Sarra", 2);
		Parent marie=new Parent("Julie",3);
		ArrayList<Parent> nieces= new ArrayList<>();
		nieces.add(marie);nieces.add(martin);
		Oncle oncle=new Oncle("LEROUGE","Eric",nieces);
		assertEquals(nieces, oncle.getNeveux());
	}
	
	/**
	 * Test method for {@link com.parent.model.Oncle#Oncle()}.
	 */
	@Test
	public void testNewOncleParams(){
		Parent martin=new Parent("Sarra", 2);
		Parent marie=new Parent("Julie",3);
		ArrayList<Parent> nieces= new ArrayList<>();
		nieces.add(marie);nieces.add(martin);
		Oncle oncle=new Oncle("LEROUGE","Eric",nieces);	
		assertTrue(oncle.getNom()=="LEROUGE" && oncle.getPrenom()=="Eric");
		assertArrayEquals(nieces.toArray(), oncle.getNeveux().toArray());
	}
	@Test
	/**
	 * Test set nom
	 */
	public void testSetNom() {
		Oncle oncle=new Oncle();
		oncle.setNom("LEROUGE");
		assertTrue(oncle.getNom().equals("LEROUGE"));
	}
	@Test
	/**
	 * Test set nom
	 */
	public void testSetPrenom() {
		Oncle oncle=new Oncle();
		oncle.setPrenom("Eric");
		assertTrue(oncle.getPrenom().equals("Eric"));
	}
	/**
	 * Test method for {@link com.parent.model.Oncle#setParents(java.util.ArrayList)}.
	 */
	@Test
	public void testSetNeveux() {
		Parent martin=new Parent("Sarra", 2);
		Parent marie=new Parent("Julie",3);
		ArrayList<Parent> nieces= new ArrayList<>();
		nieces.add(marie);
		nieces.add(martin);
		
		Oncle oncle=new Oncle();
		oncle.setNeveux(nieces);
		
		assertArrayEquals(nieces.toArray(), oncle.getNeveux().toArray());
	}
	

}

