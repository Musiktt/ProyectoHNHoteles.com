/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import hotel.Price;

/**
 *
 * @author Stward
 */
public class Double extends Room{

    public Double(int roomNumber, String roomType, String bedType, int peopleCapacity, String roomSize, String roomDescription, boolean availability, Price price) {
        super(roomNumber, roomType, bedType, peopleCapacity, roomSize, roomDescription, availability, price);
    }

    @Override
    public String getType() {
        return "A Double room";
    }
    
}
