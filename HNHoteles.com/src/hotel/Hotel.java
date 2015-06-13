/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import factory.Room;
import java.util.ArrayList;
import usuario.Administrator;
import usuario.Client;

/**
 *
 * @author Stward
 */
public class Hotel {
    //hotel searching
    private String hotelDescription;
    private String startDate;
    private String endDate;
    private int roomsIn;
    private int adultsIn;
    private int childrenIn;
        
    private String name;
    private String address;
    private String country;
    private int phoneNumber;
    private int buildingDate;

    private String hotelSize;
    private String checkInHour;
    private String checkOutHour;
    
    private String lodgingType;//cabina, hotel, hostel, todo incluido, etc
    
    private int stars;
    //lists
    private ArrayList<Attractions> attractionsList;
    private ArrayList<String> picturesList;
    private ArrayList<Room> roomsList;
    private ArrayList<Service> servicesList;
    private ArrayList<Reservation> reservationsList;
    private ArrayList<Client> clientsList;
    private  ArrayList<Administrator> administratorList;

    public Hotel() {
    }

    public Hotel(String hotelDescription, String startDate, String endDate, int roomsIn, int adultsIn, int childrenIn, String name, String address, String country, int phoneNumber, int buildingDate, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, int stars) {
        this.hotelDescription = hotelDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.roomsIn = roomsIn;
        this.adultsIn = adultsIn;
        this.childrenIn = childrenIn;
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.buildingDate = buildingDate;
        this.hotelSize = hotelSize;
        this.checkInHour = checkInHour;
        this.checkOutHour = checkOutHour;
        this.lodgingType = lodgingType;
        this.stars = stars;
        
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

    public int getRoomsIn() {
        return roomsIn;
    }

    public void setRoomsIn(int roomsIn) {
        this.roomsIn = roomsIn;
    }

    public int getAdultsIn() {
        return adultsIn;
    }

    public void setAdultsIn(int adultsIn) {
        this.adultsIn = adultsIn;
    }

    public int getChildrenIn() {
        return childrenIn;
    }

    public void setChildrenIn(int childrenIn) {
        this.childrenIn = childrenIn;
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
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
    
    //all Hotel's lists
    public ArrayList<Attractions> getAttractionsList() {
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
        return "Hotel{" + "hotelDescription=" + hotelDescription + ", startDate=" + startDate + ", endDate=" + endDate + ", roomsIn=" + roomsIn + ", adultsIn=" + adultsIn + ", childrenIn=" + childrenIn + ", name=" + name + ", address=" + address + ", country=" + country + ", phoneNumber=" + phoneNumber + ", buildingDate=" + buildingDate + ", hotelSize=" + hotelSize + ", checkInHour=" + checkInHour + ", checkOutHour=" + checkOutHour + ", lodgingType=" + lodgingType + ", stars=" + stars + '}';
    }
    
}
