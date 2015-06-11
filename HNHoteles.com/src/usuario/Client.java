/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import hotel.Reservation;
import java.util.ArrayList;

/**
 *
 * @author Stward
 */
public class Client extends User{
    private int partnerNumber;
    private String country;
    private int phonenNumber;
    private int coinType;//Moneda de predileccion
    
    private ArrayList<Reservation> cancelledReservations;
    private ArrayList<Reservation> pendingReservations;
    private ArrayList<Reservation> completedReservations;

    public Client() {
    }

    public Client(int partnerNumber, String country, int phonenNumber, int coinType, String name, String lastName, String gender, String email, String password) {
        super(name, lastName, gender, email, password);
        this.partnerNumber = partnerNumber;
        this.country = country;
        this.phonenNumber = phonenNumber;
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

    public int getPhonenNumber() {
        return phonenNumber;
    }

    public void setPhonenNumber(int phonenNumber) {
        this.phonenNumber = phonenNumber;
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
        return "Client{" + "partnerNumber=" + partnerNumber + ", country=" + country + ", phonenNumber=" + phonenNumber + ", coinType=" + coinType + ", cancelledReservations=" + cancelledReservations + ", pendingReservations=" + pendingReservations + ", completedReservations=" + completedReservations + '}';
    }
    
    
}
