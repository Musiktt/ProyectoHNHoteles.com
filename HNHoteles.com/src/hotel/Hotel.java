/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import factory.Room;
import java.util.ArrayList;
import user.Administrator;
import user.Client;

/**
 *
 * @author Stward
 */
public class Hotel {
    //hotel searching
    private String hotelDescription;
    private int roomsIn;

        
    private String name;
    private String address;
    private String country;
    private int phoneNumber;
    private int buildingDate;

    private String hotelSize;
    private String checkInHour;
    private String checkOutHour;
    
    private String lodgingType;//cabin, hotel, hostel, all-in, etc
    
    private int stars;
    
    private boolean livingRoom;
     private boolean terrace;
     private boolean seaView;
     private boolean allIn;
     private boolean smokingArea;
    
    //lists
    private ArrayList<Attraction> attractionsList;
    private ArrayList<String> picturesList;
    private ArrayList<Room> roomsList;
    private ArrayList<Service> servicesList;
    private ArrayList<Reservation> reservationsList;
    private ArrayList<Client> clientsList;
    private ArrayList<Administrator> administratorList;
    

    public Hotel() {
    }

    public Hotel(String hotelDescription, int roomsIn,String name, String address, int phoneNumber, int buildingDate, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, int stars) {
        this.hotelDescription = hotelDescription;
        this.roomsIn = roomsIn;

        this.name = name;
        this.address = address;
        this.country = "Costa Rica";
        this.phoneNumber = phoneNumber;
        this.buildingDate = buildingDate;
        this.hotelSize = hotelSize;
        this.checkInHour = checkInHour;
        this.checkOutHour = checkOutHour;
        this.lodgingType = lodgingType;
        this.stars = stars;
        
        this.allIn = true;
        this.livingRoom = true;
        this.seaView = true;
        this.smokingArea = true;
        this.terrace = true;
        
        this.attractionsList = new ArrayList<>();
        this.picturesList = new ArrayList<>();
        this.reservationsList = new ArrayList<>();
        this.roomsList = new ArrayList<>();
        this.servicesList = new ArrayList<>();
        this.clientsList = new ArrayList<>();
        this.administratorList = new ArrayList<>();
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }
    
    public int getRoomsIn() {
        return roomsIn;
    }

    public void setRoomsIn(int roomsIn) {
        this.roomsIn = roomsIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return this.country;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBuildingDate() {
        return buildingDate;
    }

    public void setBuildingDate(int buildingDate) {
        this.buildingDate = buildingDate;
    }

    public String getHotelSize() {
        return hotelSize;
    }

    public void setHotelSize(String hotelSize) {
        this.hotelSize = hotelSize;
    }

    public String getCheckInHour() {
        return checkInHour;
    }

    public void setCheckInHour(String checkInHour) {
        this.checkInHour = checkInHour;
    }

    public String getCheckOutHour() {
        return checkOutHour;
    }

    public void setCheckOutHour(String checkOutHour) {
        this.checkOutHour = checkOutHour;
    }

    public String getLodgingType() {
        return lodgingType;
    }

    public void setLodgingType(String lodgingType) {
        this.lodgingType = lodgingType;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    //boolean information
    public boolean isLivingRoom() {
        return this.livingRoom;
    }

    public boolean isTerrace() {
        return this.terrace;
    }

    public boolean isSeaView() {
        return this.seaView;
    }

    public boolean isAllIn() {
        return this.allIn;
    }

    public boolean isSmokingArea() {
        return this.smokingArea;
    }
    
    //all Hotel's lists
    public ArrayList<Attraction> getAttractionsList() {
        return this.attractionsList;
    }

    public ArrayList<String> getPicturesList() {
        return this.picturesList;
    }

    public ArrayList<Room> getRoomsList() {
        return this.roomsList;
    }

    public ArrayList<Service> getServicesList() {
        return this.servicesList;
    }

    public ArrayList<Reservation> getReservationsList() {
        return this.reservationsList;
    }

    public ArrayList<Client> getClientsList() {
        return this.clientsList;
    }

    public ArrayList<Administrator> getAdministratorList() {
        return this.administratorList;
    }

    @Override
    public String toString() {
        return "Hotel{" + "hotelDescription=" + hotelDescription + ", roomsIn=" + roomsIn + ", name=" + name + ", address=" + address + ", country=" + country + ", phoneNumber=" + phoneNumber + ", buildingDate=" + buildingDate + ", hotelSize=" + hotelSize + ", checkInHour=" + checkInHour + ", checkOutHour=" + checkOutHour + ", lodgingType=" + lodgingType + ", stars=" + stars + '}';
    }
    
}
