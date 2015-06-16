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
public class RoomFactory implements RoomFactoryCreator{
    
    @Override
    public Room createRoom(int roomNumber,String roomType,String bedType, int peopleCapacity, String roomSize, String roomDescription, boolean availability,Price price) {
        if(roomType.equals("Individual")){
            return new Individual(roomNumber, roomType,bedType, peopleCapacity, roomSize, roomDescription,availability, price);
        }
        else if(roomType.equals("Double")){
            return new Double(roomNumber, roomType,bedType, peopleCapacity, roomSize, roomDescription,availability, price);
        }
        else if(roomType.equals("Family")){
            return new Family(roomNumber, roomType,bedType, peopleCapacity, roomSize, roomDescription,availability, price);
        }
        else if(roomType.equals("Suite")){
            return new Suite(roomNumber, roomType,bedType, peopleCapacity, roomSize, roomDescription,availability, price);
        }
        return null;
    }
}
