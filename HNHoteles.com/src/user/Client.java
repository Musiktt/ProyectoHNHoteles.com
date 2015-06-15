/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

import hnhoteles.com.Additional;
import hotel.Reservation;
import java.util.ArrayList;


/**
 *
 * @author Stward
 */
public class Client extends User{
    private int partnerNumber;
    private String country;
    private int phoneNumber;
    private String coinType;//Moneda de predileccion
    
    private ArrayList<Reservation> cancelledReservations;
    private ArrayList<Reservation> pendingReservations;
    private ArrayList<Reservation> completedReservations;

    public Client() {
    }

    public Client(int partnerNumber, String country, int phoneNumber, String coinType, String name, String lastName, String gender, String email, String password) {
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
        return partnerNumber;
    }

    public void setPartnerNumber(int partnerNumber) {
        this.partnerNumber = partnerNumber;
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

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
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
    
    //verifies if a reservation exist in the system
    public boolean ifReservationExist(Reservation reservation){
        for(Reservation r : this.pendingReservations){
            if(reservation.equals(r)){
                return true;
            }
        }
        return false;
    }
        
    public void completeReservation(Reservation reservation){
        
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
