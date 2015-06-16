/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hnhoteles.com;


import GUI.Login;

/**
 *
 * @author Stward
 */
public class HNHotelesCom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Additional instance = new Additional();//singleton
        Additional.createHotel("A majestic hotel for your family", 100, "Hotel Scarlett Spring", "Fortuna", 24740102, 1995, "Huge", "06:00", "23:00", "Hotel", "5", true, true, false, true, false);
        Additional.createHotel("An amazing hotel for spending time with friends!", 50, "Hotel The Revenger", "Flamingo", 24740203, 2005, "Medium", "7:00", "18:00", "Cabin", "2", true, false, true, false, true);
        Additional.createAdministrator(87411082, "Costa Rica", "Stward", "Pérez", "Male", "musiktt@gmail.com", "pass1");
        Additional.createAdministrator(88901530, "USA", "Maggie", "Portman", "Female", "portman@gmail.com", "pass2");
        Additional.createClient(Additional.randomPartnerNumber(), "Japan", 0053116072, "Dollar", "Yamato", "Rinko", "Female", "rinko@gmail.com", "pass3");
        Additional.createClient(Additional.randomPartnerNumber(), "Mexico", 005255765544, "Dollar", "Pedro", "Dominguez", "Male", "dominguez@gmail.com", "pass4");
        Additional.createSeason("Hotel Scarlett Spring", "High Season", "HS 1", "April", "September");
        Login login = new Login();
        
        login.setVisible(true);
    }
    
}
