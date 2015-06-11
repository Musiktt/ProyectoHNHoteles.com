/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

/**
 *
 * @author Stward
 */
public class Globals {
     public static Globals instance;

    public Globals() {
    }
     
    public static Globals getInstance(){
        if(instance == null)
            instance = new Globals();
        return instance;
    }
}
