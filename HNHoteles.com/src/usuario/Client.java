/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import hnhoteles.com.Additional;
import hotel.Hotel;
import hotel.Reservation;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Stward
 */
public class Client extends User{
    private int partnerNumber;
    private String country;
    private int phoneNumber;
    private int coinType;//Moneda de predileccion
    
    private ArrayList<Reservation> cancelledReservations;
    private ArrayList<Reservation> pendingReservations;
    private ArrayList<Reservation> completedReservations;

    public Client() {
    }

    public Client(int partnerNumber, String country, int phoneNumber, int coinType, String name, String lastName, String gender, String email, String password) {
        super(name, lastName, gender, email, password);
        this.partnerNumber = partnerNumber;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.coinType = coinType;
        this.cancelledReservations = new ArrayList<>();
        this.completedReservations = new ArrayList<>();
        this.pendingReservations = new ArrayList<>();
    }
    
    public int getPartnerNumber() {
        int number = new Random().nextInt(1000000);
        return number;
    }

    public void setPartnerNumber(int partnerNumber) {
        
        if(Additional.partnerNumberList.isEmpty()){
            this.partnerNumber = this.getPartnerNumber();
            Additional.partnerNumberList.add(this.partnerNumber);
        }
        else if(!Additional.partnerNumberList.isEmpty()){
            for(int i=0;i < Additional.partnerNumberList.size();i++){
                if (this.partnerNumber == Additional.partnerNumberList.get(i))
                    return;
                else {
                    this.partnerNumber = this.getPartnerNumber();
                    Additional.partnerNumberList.add(this.partnerNumber);
                }
            }
        }
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

    public int getCoinType() {
        return coinType;
    }

    public void setCoinType(int coinType) {
        this.coinType = coinType;
    }

    public ArrayList<Reservation> getCancelledReservations() {
        return this.cancelledReservations;
    }

    public ArrayList<Reservation> getPendingReservations() {
        return this.pendingReservations;
    }

    public ArrayList<Reservation> getCompletedReservations() {
        return this.completedReservations;
    }

    @Override
    public String toString() {
        return "Client{" + "partnerNumber=" + partnerNumber + ", country=" + country + ", phoneNumber=" + phoneNumber + ", coinType=" + coinType + ", cancelledReservations=" + cancelledReservations + ", pendingReservations=" + pendingReservations + ", completedReservations=" + completedReservations + '}';
    }
    
    //creates a reservation
    public void createReservation(String start, String end, String roomType, double total, Client personInCharge, int childrenIn, int adultsIn, Hotel hotel){
        Reservation reservation = new Reservation(start,end,roomType,total,personInCharge,childrenIn,adultsIn, hotel);
        this.pendingReservations.add(reservation);
    }
    //verifies if a reservation exist in the system
    public boolean ifReservationExist(Reservation reservation){
        for(Reservation r : this.pendingReservations){
            if(reservation.equals(r)){
                return true;
            }
        }
        return false;
    }
        
    public void completeReservation(Client client, Reservation reservation){
        
        if(ifReservationExist(reservation) != false){
            this.pendingReservations.remove(reservation);
            this.completedReservations.add(reservation);
            Additional.completedReservations.add(reservation);
        }
    }    
    public void cancelReservation(Reservation reservation){
        
        if(ifReservationExist(reservation) != false){
            this.pendingReservations.remove(reservation);
            this.cancelledReservations.add(reservation);
            Additional.cancelledReservations.add(reservation);
        }
    }
    
    
    
}
