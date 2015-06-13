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
public interface RoomFactoryCreator {
    public Room createRoom(int roomNumber, String bedType, int peopleCapacity, String roomSize, String roomDescription, Season season, Price price);
}
