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
public class UserIT {
    
    public UserIT() {
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
     * Test of addCard method, of class User.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        User instance = new UserImpl();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHandValue method, of class User.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        User instance = new UserImpl();
        int expResult = 0;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class UserImpl implements User {

        public void addCard(Card card) {
        }

        public int getHandValue() {
            return 0;
        }
    }
    
}
