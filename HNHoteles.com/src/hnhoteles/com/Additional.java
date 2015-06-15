/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;


import exceptions.StringPhoneNumberException;
import factory.Room;
import hotel.Attraction;
import hotel.Hotel;
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
            String decrypted = Additional.decryptPassword(administrator.getPassword());
            if(administrator.getEmail().equals(email) && decrypted.equals(password)){
                return administrator;
            }
        }
        return null;
    }
    public static Client loginClient(String email, String password){
        for(Client client : Additional.clientsList){
            String decrypted = Additional.decryptPassword(client.getPassword());
            if(client.getEmail().equals(email) && decrypted.equals(password)){
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
    
    public static void setAvailability(Reservation reservation){
        
    }
    public static void addRoomsToHotel(Hotel hotel, Room room){
        
    }
    public static void ifRoomNumberExist(Room room){
        
    }
    public static void reservationCost(Reservation reservation){
        
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
