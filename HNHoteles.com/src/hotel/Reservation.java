/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.ArrayList;
import usuario.Client;

/**
 *
 * @author Stward
 */
public class Reservation {
    private ArrayList<Room> rooms;
    private String start;
    private String end;
    private String roomType;
    private double total;
    private Client personInCharge;
    private int childrenIn;
    private int adultsIn;
    private Hotel hotel;

    public Reservation() {
    }

    public Reservation(String start, String end, String roomType, double total, Client personInCharge, int childrenIn, int adultsIn, Hotel hotel) {
        this.start = start;
        this.end = end;
        this.roomType = roomType;
        this.total = total;
        this.personInCharge = personInCharge;
        this.childrenIn = childrenIn;
        this.adultsIn = adultsIn;
        this.hotel = hotel;
        this.rooms=new ArrayList<>();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Client getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(Client personInCharge) {
        this.personInCharge = personInCharge;
    }

    public int getChildrenIn() {
        return childrenIn;
    }

    public void setChildrenIn(int childrenIn) {
        this.childrenIn = childrenIn;
    }

    public int getAdultsIn() {
        return adultsIn;
    }

    public void setAdultsIn(int adultsIn) {
        this.adultsIn = adultsIn;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    @Override
    public String toString() {
        return "Reservation{" + "rooms=" + rooms + ", entrance=" + start + ", exit=" + end + ", roomType=" + roomType + ", total=" + total + ", personInCharge=" + personInCharge + ", childrenIn=" + childrenIn + ", adultsIn=" + adultsIn + ", hotel=" + hotel + '}';
    }
    
    
    
}
