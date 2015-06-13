/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import hotel.Price;

/**
 *
 * @author Stward
 */
public abstract class Room {
    private int roomNumber;
    private String roomType;
    
    //Storage information
    
    private String bedType;
    private int peopleCapacity;
    private String roomSize;
    private String roomDescription;
    
    //Indications if this has:
    private boolean availability;//only in case of reservation
    
    private Price price;

    public Room() {
    }

    public Room(int roomNumber, String roomType, String bedType, int peopleCapacity, String roomSize, String roomDescription, Price price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.bedType = bedType;
        this.peopleCapacity = peopleCapacity;
        this.roomSize = roomSize;
        this.roomDescription = roomDescription;
        this.price = price;
    
        this.availability = true;

    }
    
    //constructor to storage


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public String getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(String roomSize) {
        this.roomSize = roomSize;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }
    
    //Room's boolean information
    public boolean isAvailability() {
        return this.availability;
    }

    public abstract String getType();
}
