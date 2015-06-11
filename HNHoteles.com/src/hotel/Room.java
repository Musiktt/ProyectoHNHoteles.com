/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import java.util.ArrayList;

/**
 *
 * @author Stward
 */
public class Room {
    private int roomNumber;
    private String roomType;
    
    //Informacion de almacenamiento
    private boolean availability;
    private String bedType;
    private int peopleCapacity;
    private String roomSize;
    private String roomDescription;
    
    //Indicaciones si posee:
    private boolean livingRoom;
    private boolean terrace;
    private boolean seaView;
    private boolean allIn;
    private boolean smokingArea;
    
    private Season season;
    private Price price;

    public Room() {
    }

    public Room(int roomNumber, String roomType, boolean availability, String bedType, int peopleCapacity, String roomSize, String roomDescription, boolean livingRoom, boolean terrace, boolean seaView, boolean allIn, boolean smokingArea, Season season, Price price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.availability = availability;
        this.bedType = bedType;
        this.peopleCapacity = peopleCapacity;
        this.roomSize = roomSize;
        this.roomDescription = roomDescription;
        this.livingRoom = livingRoom;
        this.terrace = terrace;
        this.seaView = seaView;
        this.allIn = allIn;
        this.smokingArea = smokingArea;
        this.season = season;
        this.price = price;
    }
    
    
    //constructor to storage
    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }
    
    
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

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
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

    public boolean isLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(boolean livingRoom) {
        this.livingRoom = livingRoom;
    }

    public boolean isTerrace() {
        return terrace;
    }

    public void setTerrace(boolean terrace) {
        this.terrace = terrace;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public boolean isAllIn() {
        return allIn;
    }

    public void setAllIn(boolean allIn) {
        this.allIn = allIn;
    }

    public boolean isSmokingArea() {
        return smokingArea;
    }

    public void setSmokingArea(boolean smokingArea) {
        this.smokingArea = smokingArea;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" + "roomNumber=" + roomNumber + ", roomType=" + roomType + ", availability=" + availability + ", bedType=" + bedType + ", peopleCapacity=" + peopleCapacity + ", roomSize=" + roomSize + ", roomDescription=" + roomDescription + ", livingRoom=" + livingRoom + ", terrace=" + terrace + ", seaView=" + seaView + ", allIn=" + allIn + ", smokingArea=" + smokingArea + ", season=" + season + ", price=" + price + '}';
    }
    
    
}
