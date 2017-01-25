package com.animal.test;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.animal.model.Animal;
import com.animal.model.Maitre;

/**
 * The test class testAnimal.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testAnimal
{
    private Animal animal1;
    private Maitre maitre1;

    /**
     * Default constructor for test class testAnimal
     */
    public testAnimal()
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
        animal1 = new Animal();
        animal1.setNom("TOM");
        animal1.setRace("chat");
        maitre1 = new Maitre();
        maitre1.setNom("toto");
        maitre1.setAnimal(animal1);
        maitre1.animalDeCompagnie();
        maitre1.animalDeCompagnie();
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

    @Test
    public void testRace()
    {
        Animal animal1 = new Animal();
        animal1.setRace("chat");
        assertEquals("chat", animal1.getRace());
        animal1.informationAnimal();
    }

    @Test
    public void testAnimalDeCompagnie()
    {
        assertEquals("toto est le maitre de TOM", maitre1.animalDeCompagnie());
    }

    

    @Test
    public void testGetRace()
    {
        assertEquals("chat", animal1.getRace());
    }

   

    @Test
    public void TestGetNom()
    {
        assertEquals("TOM", animal1.getNom());
    }

    @Test
    public void TestGetNomMaitre()
    {
        assertEquals("toto", maitre1.getNom());
    }


    @Test
    public void TestSetNom()
    {
        animal1.setNom("TOM");
        assertEquals("TOM", animal1.getNom());
    }

    @Test
    public void TestSetRace()
    {
        animal1.setRace("CHAT");
        assertEquals("CHAT", animal1.getRace());
    }

    @Test
    public void TestSetNomMaitre()
    {
        maitre1.setNom("TOTO");
        assertEquals("TOTO", maitre1.getNom());
    }

    @Test
    public void TestConstructeurAnimal()
    {
        Animal animal2 = new Animal();
        assertEquals("tom", animal2.getNom());
        assertEquals("chat", animal2.getRace());
    }

    @Test
    public void TestConstructeurMaitre()
    {
        Maitre maitre2 = new Maitre();
        assertEquals("TOTO", maitre2.getNom());
    }

    @Test
    public void testAssociation()
    {
        maitre1.setAnimal(animal1);
        assertEquals("toto est le maitre de TOM", maitre1.animalDeCompagnie());
    }
}





