/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;


import factory.Room;
import hotel.Attraction;
import hotel.Hotel;
import hotel.Reservation;
import hotel.Season;
import hotel.Service;
import java.util.ArrayList;
import user.Administrator;
import user.Client;


/**
 *
 * @author Stward
 */
public class Additional {
    public static ArrayList<Hotel> hotelList;
    public static ArrayList<Room> roomsList;
    public static ArrayList<Integer> partnerNumberList;
    public static ArrayList<Reservation> cancelledReservations;
    public static ArrayList<Reservation> completedReservations;
    public static ArrayList<Reservation> reservationsHistory;
    public static ArrayList<Season> seasonsList;
    public static ArrayList<Attraction> attractionsList;
    public static ArrayList<Client> clientsList;
    public static ArrayList<Administrator> administratorsList;
    public static ArrayList<Service> servicesList;
    

    
    //Create new objects
    public static void createAdministrator(int phoneNumber, String country, String name, String lastName, String gender, String email, String password){
        Additional.administratorsList.add(new Administrator(phoneNumber, country, name, lastName, gender, email, password));
    }
    public static void createClient(int partnerNumber, String country, int phoneNumber, int coinType, String name, String lastName, String gender, String email, String password){
        Additional.clientsList.add(new Client(partnerNumber, country, phoneNumber, coinType, name, lastName, gender, email, password));
    }  
    public static void createHotel(String hotelDescription, int roomsIn, String name, String address, int phoneNumber, int buildingDate, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, int stars){
        Additional.hotelList.add(new Hotel(hotelDescription,roomsIn, name,address, phoneNumber,buildingDate, hotelSize, checkInHour, checkOutHour,lodgingType,stars));
    }
    public static void createSeason(String name, String code, String startDate, String endDate){
        Additional.seasonsList.add(new Season(name,code,startDate, endDate));
    }
    public static void createService(String name, String code){
        Additional.servicesList.add(new Service(name,code));
    }
    public static void createAttraction(String name, String id){
        Additional.attractionsList.add(new Attraction(name,id));
    }
    //login methods
    public static Administrator loginAdministrator(String email, String password){
        for(Administrator administrator : Additional.administratorsList){
            if(administrator.getEmail().equals(email) && administrator.getPassword().equals(password)){
                return administrator;
            }
        }
        return null;
    }
    public static Client loginClient(String email, String password){
        for(Client client : Additional.clientsList){
            if(client.getEmail().equals(email) && client.getPassword().equals(password)){
                return client;
            }
        }
        return null;
    }
    //in order to find a user    
    public static Client findClient(String email){
        if(Additional.clientsList.size() > 0) {
            for(Client client : Additional.clientsList){
                if(client.getEmail().equals(email)){
                    return client;
                }
            }
        }
        return null;
    }
    public static Administrator findAdministrator(String email){
        if(Additional.administratorsList.size() > 0) {
            for(Administrator administrator : Additional.administratorsList){
                if(administrator.getEmail().equals(email)){
                    return administrator;
                }
            }
        }
        return null;
    }
    public static void setAvailability(Reservation reservation){
        
    }
    public static void addRoomsToHotel(Hotel hotel, Room room){
        
    }
    public static void ifRoomNumberExist(Room room){
        
    }
    public static void reservationCost(Reservation reservation){
        
    }
}
