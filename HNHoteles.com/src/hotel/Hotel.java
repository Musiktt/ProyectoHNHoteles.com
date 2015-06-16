/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;

import factory.Room;
import java.util.ArrayList;

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
    private int buildingYear;

    private String hotelSize;
    private String checkInHour;
    private String checkOutHour;
    
    private String lodgingType;//cabin, hotel, hostel, all-in, etc
    
    private String stars;
    
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
    private ArrayList<Season> seasonsList;
    

    public Hotel() {
    }

    public Hotel(String hotelDescription, int roomsIn, String name, String address, String country, int phoneNumber, int buildingYear, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, String stars, boolean livingRoom, boolean terrace, boolean seaView, boolean allIn, boolean smokingArea) {
        this.hotelDescription = hotelDescription;
        this.roomsIn = roomsIn;
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.buildingYear = buildingYear;
        this.hotelSize = hotelSize;
        this.checkInHour = checkInHour;
        this.checkOutHour = checkOutHour;
        this.lodgingType = lodgingType;
        this.stars = stars;
        this.livingRoom = livingRoom;
        this.terrace = terrace;
        this.seaView = seaView;
        this.allIn = allIn;
        this.smokingArea = smokingArea;
                
        this.attractionsList = new ArrayList<>();
        this.picturesList = new ArrayList<>();
        this.reservationsList = new ArrayList<>();
        this.roomsList = new ArrayList<>();
        this.servicesList = new ArrayList<>();
        this.clientsList = new ArrayList<>();

        this.seasonsList = new ArrayList<>();
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

    public int getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(int buildingYear) {
        this.buildingYear = buildingYear;
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

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    //boolean information
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

    public ArrayList<Season> getSeasonsList() {
        return this.seasonsList;
    }
    
    @Override
    public String toString() {
        return "Hotel{" + "hotelDescription=" + hotelDescription + ", roomsIn=" + roomsIn + ", name=" + name + ", address=" + address + ", country=" + country + ", phoneNumber=" + phoneNumber + ", buildingYear=" + buildingYear + ", hotelSize=" + hotelSize + ", checkInHour=" + checkInHour + ", checkOutHour=" + checkOutHour + ", lodgingType=" + lodgingType + ", stars=" + stars + ", livingRoom=" + livingRoom + ", terrace=" + terrace + ", seaView=" + seaView + ", allIn=" + allIn + ", smokingArea=" + smokingArea + '}';
    }  
}
