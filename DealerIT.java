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
public class DealerIT {
    
    public DealerIT() {
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
     * Test of dealCard method, of class Dealer.
     */
    @Test
    public void testDealCard() {
        System.out.println("dealCard");
        Dealer instance = new Dealer();
        Card expResult = null;
        Card result = instance.dealCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class Dealer.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        Dealer instance = new Dealer();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hitOrStand method, of class Dealer.
     */
    @Test
    public void testHitOrStand() {
        System.out.println("hitOrStand");
        Dealer instance = new Dealer();
        instance.hitOrStand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dealerPlays method, of class Dealer.
     */
    @Test
    public void testDealerPlays() {
        System.out.println("dealerPlays");
        Dealer instance = new Dealer();
        instance.dealerPlays();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareHands method, of class Dealer.
     */
    @Test
    public void testCompareHands() {
        System.out.println("compareHands");
        Dealer instance = new Dealer();
        instance.compareHands();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of playAgain method, of class Dealer.
     */
    @Test
    public void testPlayAgain() {
        System.out.println("playAgain");
        Dealer instance = new Dealer();
        instance.playAgain();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Dealer.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Dealer instance = new Dealer();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getHandValue method, of class Dealer.
     */
    @Test
    public void testGetHandValue() {
        System.out.println("getHandValue");
        Dealer instance = new Dealer();
        int expResult = 0;
        int result = instance.getHandValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
