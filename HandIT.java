/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mluney
 */
public class HandIT {
    
    public HandIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayHand method, of class Hand.
     */
    @Test
    public void testDisplayHand() {
        System.out.println("displayHand");
        Hand instance = new Hand();
        instance.displayHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayDealerStartHand method, of class Hand.
     */
    @Test
    public void testDisplayDealerStartHand() {
        System.out.println("displayDealerStartHand");
        Hand instance = new Hand();
        instance.displayDealerStartHand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Hand instance = new Hand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Hand.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
