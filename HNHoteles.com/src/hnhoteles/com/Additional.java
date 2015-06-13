/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;


import factory.Room;
import hotel.Hotel;
import hotel.Reservation;
import hotel.Season;
import java.util.ArrayList;
import usuario.Administrator;
import usuario.Client;

/**
 *
 * @author Stward
 */
public class Additional {
    public static ArrayList<Hotel> hotelList;
    public static ArrayList<Integer> partnerNumberList;
    public static ArrayList<Reservation> cancelledReservations;
    public static ArrayList<Reservation> completedReservations;
    public static ArrayList<Reservation> reservationsHistory;
    public static ArrayList<Season> seasonsList;

    
    
    public static void createAdministrator(Hotel hotel, int phoneNumber, String country, String name, String lastName, String gender, String email, String password){
        hotel.getAdministratorList().add(new Administrator(phoneNumber, country, name, lastName, gender, email, password));
    }
        
    public static void createClient(Hotel hotel,int partnerNumber, String country, int phoneNumber, int coinType, String name, String lastName, String gender, String email, String password){
        hotel.getClientsList().add(new Client(partnerNumber, country, phoneNumber, coinType, name, lastName, gender, email, password));
    }  
    
    public static void createHotel(String hotelDescription, int roomsIn, String name, String address, int phoneNumber, int buildingDate, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, int stars){
        Additional.hotelList.add(new Hotel(hotelDescription,roomsIn, name,address, phoneNumber,buildingDate, hotelSize, checkInHour, checkOutHour,lodgingType,stars));
    }
    
    public static void setAvailability(Reservation reservation){
        
    }
    public static void addRoomsToHotel(Hotel hotel, Room room){
        
    }
    public static void createSeason(Season season){
        
    }
    public static void ifRoomNumberExist(Room room){
        
    }
    public static void reservationCost(Reservation reservation){
        
    }
}
