/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;


import exceptions.StringPhoneNumberException;
import factory.Room;
import factory.RoomFactory;
import hotel.Attraction;
import hotel.Hotel;
import hotel.Price;
import hotel.Reservation;
import hotel.Season;
import hotel.Service;
import java.util.ArrayList;
import java.util.Random;
import user.Administrator;
import user.Client;


/**
 *
 * @author Stward
 */
public class Additional {
    public static ArrayList<Hotel> hotelList = new ArrayList();
    public static ArrayList<Room> roomsList = new ArrayList();
    public static ArrayList<Integer> partnerNumberList = new ArrayList();
    public static ArrayList<Reservation> cancelledReservations= new ArrayList();;
    public static ArrayList<Reservation> completedReservations= new ArrayList();;
    public static ArrayList<Reservation> reservationsHistory= new ArrayList();;
    public static ArrayList<Season> seasonsList = new ArrayList();
    public static ArrayList<Attraction> attractionsList = new ArrayList();
    public static ArrayList<Client> clientsList = new ArrayList();
    public static ArrayList<Administrator> administratorsList = new ArrayList(); 
    public static ArrayList<Service> servicesList = new ArrayList();

   
    public Additional() {
    }


    //Create new objects
    public static void createAdministrator(int phoneNumber, String country, String name, String lastName, String gender, String email, String password){
        Additional.administratorsList.add(new Administrator(phoneNumber, country, name, lastName, gender, email, password));
    }
    public static void createClient(int partnerNumber, String country, int phoneNumber, String coinType, String name, String lastName, String gender, String email, String password){
        Additional.clientsList.add(new Client(partnerNumber, country, phoneNumber, coinType, name, lastName, gender, email, password));
    }  
    public static void createHotel(String hotelDescription, int roomsIn, String name, String address, int phoneNumber, int buildingYear, String hotelSize, String checkInHour, String checkOutHour, String lodgingType, String stars,boolean livingRoom, boolean terrace, boolean seaView, boolean allIn, boolean smokingArea){
        Additional.hotelList.add(new Hotel(hotelDescription, roomsIn, name, address, name, phoneNumber, buildingYear, hotelSize, checkInHour, checkOutHour, lodgingType, stars, livingRoom, terrace, seaView, allIn, smokingArea));
    }
    public static void createSeason(String nameSeason,String name, String code, String startDate, String endDate){
        Additional.findHotel(nameSeason).getSeasonsList().add(new Season(name, code, startDate, endDate));
    }
    public static void createService(String nameService,String name, String code){
        Additional.findHotel(nameService).getServicesList().add(new Service(name,code));
    }
    public static void createAttraction(String nameAttraction,String name, String id){
        Additional.findHotel(nameAttraction).getAttractionsList().add(new Attraction(name,id));
    }
    public static void createRoom(String name,int roomNumber,String roomType,String bedType, int peopleCapacity, String roomSize, String roomDescription, boolean availability,Price price) {
        Additional.findHotel(name).getRoomsList().add(new RoomFactory().createRoom(roomNumber, roomType, bedType, peopleCapacity, roomSize, roomDescription, availability, price));
    }
    //login methods
    public static Administrator loginAdministrator(String email, String password){
        for(Administrator administrator : Additional.administratorsList){
            if(administrator.getEmail().equals(email) && administrator.getPassword().equals(password)){
                return administrator;
            }
            else{
                String decrypted = Additional.decryptPassword(administrator.getPassword());
                if(administrator.getEmail().equals(email) && decrypted.equals(password)){
                    return administrator;
                }
            }
           
        }
        return null;
    }
    public static Client loginClient(String email, String password){
        for(Client client : Additional.clientsList){
            
            if(client.getEmail().equals(email) && client.getPassword().equals(password)){
                return client;
            }
            else{
                String decrypted = Additional.decryptPassword(client.getPassword());
                if(client.getEmail().equals(email) && decrypted.equals(password)){
                    return client;
                }
            }
        }
        return null;
    }
    //method in order to find a hotel
    public static Hotel findHotel(String name){
        if(Additional.hotelList.size() > 0) {
            for(Hotel hotel : Additional.hotelList){
                if(hotel.getName().equals(name)){
                    return hotel;
                }
            }
        }
        return null;
    } 
    public static Hotel findHotel(int phoneNumber){
        if(Additional.hotelList.size() > 0) {
            for(Hotel hotel : Additional.hotelList){
                if(hotel.getPhoneNumber()== phoneNumber){
                    return hotel;
                }
            }
        }
        return null;
    }
    //in order to find an user    
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
    public static Client findClient(int phoneNumber){
        if(Additional.clientsList.size() > 0) {
            for(Client client : Additional.clientsList){
                if(client.getPhoneNumber()== phoneNumber){
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
    public static Administrator findAdministrator(int phoneNumber){
        if(Additional.administratorsList.size() > 0) {
            for(Administrator administrator : Additional.administratorsList){
                if(administrator.getPhoneNumber() == phoneNumber){
                    return administrator;
                }
            }
        }
        return null;
    }
    //Methods in order to find a room number
    public static Room findRoom(Hotel hotel, int roomNumber){
        if(hotel.getRoomsList().size() > 0) {
            for(Room room : hotel.getRoomsList()){
                if(room.getRoomNumber() == roomNumber){
                    return room;
                }
            }
        }
        return null;        
    }
    //Methods that find a season, attraction or service
    public static Season findSeason(Hotel hotel, String name){
        if(hotel.getSeasonsList().size() > 0) {
            for(Season season : hotel.getSeasonsList()){
                if(season.getName().equals(name)){
                    return season;
                }
            }
        }
        return null;
    }
    public static Attraction findAttraction(Hotel hotel, String name){
        if(hotel.getAttractionsList().size() > 0) {
            for(Attraction attraction : hotel.getAttractionsList()){
                if(attraction.getName().equals(name)){
                    return attraction;
                }
            }
        }
        return null;
    }
    public static Service findService(Hotel hotel, String name){
        if(hotel.getServicesList().size() > 0) {
            for(Service service : hotel.getServicesList()){
                if(service.getName().equals(name)){
                    return service;
                }
            }
        }
        return null;
    }        
    public static Season findSeasonCode(String code){
        if(Additional.seasonsList.size() > 0) {
            for(Season season : Additional.seasonsList){
                if(season.getCode().equals(code)){
                    return season;
                }
            }
        }
        return null;
    }
    public static Attraction findAttractionID(String ID){
        if(Additional.attractionsList.size() > 0) {
            for(Attraction attraction : Additional.attractionsList){
                if(attraction.getId().equals(ID)){
                    return attraction;
                }
            }
        }
        return null;
    }
    public static Service findServiceCode(String code){
        if(Additional.servicesList.size() > 0) {
            for(Service service : Additional.servicesList){
                if(service.getCode().equals(code)){
                    return service;
                }
            }
        }
        return null;
    }          
    //Exception methods in order to show the exception's message
    public static boolean phoneNumberExceptionLower(String phoneNumber){
        String numbers = "abcdefghyjklmnñopqrstuvwxyz";
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (numbers.indexOf(phoneNumber.charAt(i), 0) != -1) {
                return true;
            }
        }
        return false;
    }
    public static boolean phoneNumberExceptionUpper(String phoneNumber){
        String numbers = "ABCDEFGHYJKLMNÑOPQRSTUVWXYZ";
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (numbers.indexOf(phoneNumber.charAt(i), 0) != -1) {
                return true;
            }
        }
        return false;
    }
    //Method in order to verify if the password has the required number
    public static boolean hasNumbers(String password) {
        String numbers = "0123456789";
        for (int i = 0; i < password.length(); i++) {
            if (numbers.indexOf(password.charAt(i), 0) != -1) {
                return true;
            }
        }
        return false;
    }
    //Shows the exception created
    public static void showExceptionMessage(){
        StringPhoneNumberException exceptionReact = new StringPhoneNumberException("Letter(s) in phone number blank");
        System.err.println(exceptionReact);
    }
    //Method in order to validate the password 
    public static boolean validatePassword(String password){
        if(password.length() < 6 || password.length() > 20){
            return false;
        }        
        else if(!Additional.hasNumbers(password)){
            return false;
        }
        return true;
    }
    //This method gives a random partner number
    public static int randomPartnerNumber(){
        
        int partnerNumber = new Random().nextInt(2000000);
        
        if(Additional.partnerNumberList.isEmpty()){
            Additional.partnerNumberList.add(partnerNumber);
            return partnerNumber;
        }
        else {
                if (Additional.partnerNumberList.contains(partnerNumber)){
                    return 0;
                }
                else {
                    Additional.partnerNumberList.add(partnerNumber);
                    return partnerNumber;
                }
        }
    }
    
    //Methods in order to encrypt and decrypt any password
    public static String encryptPassword(String password){
        PasswordEncrypter p = new PasswordEncrypter("");
        String pass = p.encrypt(password);
        return pass;
    }
    
    public static String decryptPassword(String password){
        PasswordEncrypter p = new PasswordEncrypter("");
        String pass = p.decrypt(password);
        return pass;
    }
}
