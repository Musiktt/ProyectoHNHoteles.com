/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usuario;

import hnhoteles.com.Additional;
import hotel.Hotel;
import hotel.Reservation;

/**
 *
 * @author Stward
 */
public class Administrator extends User{
    private int phoneNumber;
    private String country;

    public Administrator() {
    }

    public Administrator(int phoneNumber, String country, String name, String lastName, String gender, String email, String password) {
        super(name, lastName, gender, email, password);
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Administrator{" + "phoneNumber=" + phoneNumber + ", country=" + country + '}';
    }
    
}
