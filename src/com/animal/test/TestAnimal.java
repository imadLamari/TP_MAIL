package com.animal.test;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.animal.model.Animal;
import com.animal.model.ComportementFelin;
import com.animal.model.IComportement;
import com.animal.model.Maitre;

/**
 * The test class testAnimal.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestAnimal
{
    
    /**
     * Default constructor for test class testAnimal
     */
    public TestAnimal()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
       
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    	
    }
    /***
     * Test le getter du paramètre nom
     */
    @Test
    public void testGetNom()
    {
        Animal animal = new Animal();
        assertEquals("", animal.getNom());
    }
    /***
     * Test le getter du paramètre race
     */
    @Test
    public void testGetRace()
    {
        Animal animal = new Animal();
        assertEquals("", animal.getRace());
    }
    /***
     * Test le getter du paramètre comportement
     */
    @Test
    public void testGetCompotrtement()
    {
        Animal animal = new Animal();
        assertEquals(null, animal.getComportement());
    }
    /***
     * Test le constructeur de Animal
     */
    @Test
    public void testConstructeurAnimal()
    {
    	String nom="Tom";
    	String race="chat";
    	IComportement comportement=new ComportementFelin();
        Animal animal = new Animal(race,nom,comportement);  
        
        assertEquals(race, animal.getRace());
        assertEquals(nom, animal.getNom());
        assertEquals(comportement, animal.getComportement());
    }
    
    /***
     * Test le getter du paramètre nom
     */
    @Test
    public void TestSetNom()
    {
    	Animal animal=new Animal();
        animal.setNom("TOM");
        assertEquals("TOM", animal.getNom());
    }
    
    /***
     * Test le getter du paramètre race
     */
    @Test
    public void TestSetRace()
    {
    	Animal animal=new Animal();
        animal.setRace("chat");
        assertEquals("chat", animal.getRace());
    }
    
    /***
     * Test le getter du paramètre race
     */
    @Test
    public void TestSetComportement()
    {
    	Animal animal=new Animal();
        animal.setComportement(new ComportementFelin());
        assertNotNull(animal.getComportement());
    }
    
}





