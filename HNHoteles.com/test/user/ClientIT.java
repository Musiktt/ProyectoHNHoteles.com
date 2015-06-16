/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

import hotel.Reservation;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stward
 */
public class ClientIT {
    
    public ClientIT() {
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
     * Test of getPartnerNumber method, of class Client.
     */
    @Test
    public void testGetPartnerNumber() {
        System.out.println("getPartnerNumber");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getPartnerNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPartnerNumber method, of class Client.
     */
    @Test
    public void testSetPartnerNumber() {
        System.out.println("setPartnerNumber");
        int partnerNumber = 0;
        Client instance = new Client();
        instance.setPartnerNumber(partnerNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCountry method, of class Client.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getCountry();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCountry method, of class Client.
     */
    @Test
    public void testSetCountry() {
        System.out.println("setCountry");
        String country = "";
        Client instance = new Client();
        instance.setCountry(country);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNumber method, of class Client.
     */
    @Test
    public void testGetPhoneNumber() {
        System.out.println("getPhoneNumber");
        Client instance = new Client();
        int expResult = 0;
        int result = instance.getPhoneNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoneNumber method, of class Client.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        int phoneNumber = 0;
        Client instance = new Client();
        instance.setPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoinType method, of class Client.
     */
    @Test
    public void testGetCoinType() {
        System.out.println("getCoinType");
        Client instance = new Client();
        String expResult = "";
        String result = instance.getCoinType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoinType method, of class Client.
     */
    @Test
    public void testSetCoinType() {
        System.out.println("setCoinType");
        String coinType = "";
        Client instance = new Client();
        instance.setCoinType(coinType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelledReservations method, of class Client.
     */
    @Test
    public void testGetCancelledReservations() {
        System.out.println("getCancelledReservations");
        Client instance = new Client();
        ArrayList<Reservation> expResult = null;
        ArrayList<Reservation> result = instance.getCancelledReservations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendingReservations method, of class Client.
     */
    @Test
    public void testGetPendingReservations() {
        System.out.println("getPendingReservations");
        Client instance = new Client();
        ArrayList<Reservation> expResult = null;
        ArrayList<Reservation> result = instance.getPendingReservations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedReservations method, of class Client.
     */
    @Test
    public void testGetCompletedReservations() {
        System.out.println("getCompletedReservations");
        Client instance = new Client();
        ArrayList<Reservation> expResult = null;
        ArrayList<Reservation> result = instance.getCompletedReservations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Client.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Client instance = new Client();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
