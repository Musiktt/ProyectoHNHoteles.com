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
public class RoomFactory implements RoomFactoryCreator{
    
    @Override
    public Room createRoom(int roomNumber, String bedType, int peopleCapacity, String roomSize, String roomDescription, Season season, Price price) {
        if(roomSize.equals("Individual")){
            return new Individual(roomNumber, bedType, peopleCapacity, roomSize, roomDescription, season, price);
        }
        else if(roomSize.equals("Double")){
            return new Double(roomNumber, bedType, peopleCapacity, roomSize, roomDescription, season, price);
        }
        else if(roomSize.equals("Family")){
            return new Family(roomNumber, bedType, peopleCapacity, roomSize, roomDescription, season, price);
        }
        else if(roomSize.equals("Suite")){
            return new Suite(roomNumber, bedType, peopleCapacity, roomSize, roomDescription, season, price);
        }
        return null;
    }
}
