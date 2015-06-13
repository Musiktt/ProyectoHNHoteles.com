/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;

import hotel.Hotel;
import hotel.Reservation;
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

    
    
    public static void createAdministrator(Hotel hotel, int phoneNumber, String country, String name, String lastName, String gender, String email, String password){
        hotel.getAdministratorList().add(new Administrator(phoneNumber, country, name, lastName, gender, email, password));
    }
        
    public static void createClient(Hotel hotel, int partnerNumber, String country, int phoneNumber, int coinType, String name, String lastName, String gender, String email, String password){
        hotel.getClientsList().add(new Client(partnerNumber, country, phoneNumber, coinType, name, lastName, gender, email, password));
    }  
    
    public static void createHotel(String hotelDescription, String startDate, String endDate, int roomsIn, int adultsIn, int childrenIn, String name, String address, String country, int phoneNumber, int buildingDate, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, int stars){
        Additional.hotelList.add(new Hotel(hotelDescription,startDate,endDate,roomsIn,adultsIn, childrenIn, name,address,country, phoneNumber,buildingDate, hotelSize, checkInHour, checkOutHour,lodgingType,stars));
    }

}
