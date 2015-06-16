/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import user.Client;

/**
 *
 * @author Stward
 */
public class ReservationIT {
    
    public ReservationIT() {
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
     * Test of getStartDate method, of class Reservation.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class Reservation.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        String startDate = "";
        Reservation instance = new Reservation();
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndDate method, of class Reservation.
     */
    @Test
    public void testGetEndDate() {
        System.out.println("getEndDate");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.getEndDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndDate method, of class Reservation.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        String endDate = "";
        Reservation instance = new Reservation();
        instance.setEndDate(endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomType method, of class Reservation.
     */
    @Test
    public void testGetRoomType() {
        System.out.println("getRoomType");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.getRoomType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomType method, of class Reservation.
     */
    @Test
    public void testSetRoomType() {
        System.out.println("setRoomType");
        String roomType = "";
        Reservation instance = new Reservation();
        instance.setRoomType(roomType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Reservation.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Reservation.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        int total = 0;
        Reservation instance = new Reservation();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonInCharge method, of class Reservation.
     */
    @Test
    public void testGetPersonInCharge() {
        System.out.println("getPersonInCharge");
        Reservation instance = new Reservation();
        Client expResult = null;
        Client result = instance.getPersonInCharge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonInCharge method, of class Reservation.
     */
    @Test
    public void testSetPersonInCharge() {
        System.out.println("setPersonInCharge");
        Client personInCharge = null;
        Reservation instance = new Reservation();
        instance.setPersonInCharge(personInCharge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getChildrenIn method, of class Reservation.
     */
    @Test
    public void testGetChildrenIn() {
        System.out.println("getChildrenIn");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getChildrenIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setChildrenIn method, of class Reservation.
     */
    @Test
    public void testSetChildrenIn() {
        System.out.println("setChildrenIn");
        int childrenIn = 0;
        Reservation instance = new Reservation();
        instance.setChildrenIn(childrenIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdultsIn method, of class Reservation.
     */
    @Test
    public void testGetAdultsIn() {
        System.out.println("getAdultsIn");
        Reservation instance = new Reservation();
        int expResult = 0;
        int result = instance.getAdultsIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdultsIn method, of class Reservation.
     */
    @Test
    public void testSetAdultsIn() {
        System.out.println("setAdultsIn");
        int adultsIn = 0;
        Reservation instance = new Reservation();
        instance.setAdultsIn(adultsIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRooms method, of class Reservation.
     */
    @Test
    public void testGetRooms() {
        System.out.println("getRooms");
        Reservation instance = new Reservation();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.getRooms();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Reservation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reservation instance = new Reservation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
