/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factory;

import hotel.Price;
import hotel.Season;

/**
 *
 * @author Stward
 */
public class Suite extends Room{

    public Suite(int roomNumber,String roomType,String bedType, int peopleCapacity, String roomSize, String roomDescription, Price price) {
        super(roomNumber, roomType,bedType, peopleCapacity, roomSize, roomDescription, price);
    }

    @Override
    public String getType() {
        return "A Suite room";
    }
    
}