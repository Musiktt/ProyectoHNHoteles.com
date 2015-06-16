/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;



import java.util.ArrayList;
import user.Client;

/**
 *
 * @author Stward
 */
public class Reservation {
    private ArrayList<Integer> rooms;
    private String startDate;
    private String endDate;
    private String roomType;
    private int total;
    private Client personInCharge;
    private int childrenIn;
    private int adultsIn;

    public Reservation() {
    }

    public Reservation(String startDate, String endDate, String roomType, int total, Client personInCharge, int childrenIn, int adultsIn) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomType = roomType;
        this.total = total;
        this.personInCharge = personInCharge;
        this.childrenIn = childrenIn;
        this.adultsIn = adultsIn;

        this.rooms=new ArrayList<>();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
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

    public ArrayList<Integer> getRooms() {
        return this.rooms;
    }

    @Override
    public String toString() {
        return "Reservation{" + "startDate=" + startDate + ", endDate=" + endDate + ", roomType=" + roomType + ", total=" + total + ", personInCharge=" + personInCharge + ", childrenIn=" + childrenIn + ", adultsIn=" + adultsIn + '}';
    }
    
    
}
