/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rooms;

/**
 *
 * @author magdalenafernlund
 */
public class Room1 extends Room{
    
    private Room toNorth; 
    private Room toSouth;
    private Room toEast ;
    private Room toWest;

   
    public Room1() {
        toNorth = null; 
        toSouth = null; 
        toEast = null;  
        toWest = null; 
        
    }
    
    @Override
    public String roomName() {
        return "Room1"; 
    }
    
    @Override
    public void PrintRoomInfo() {
        System.out.println("\nAs you enter the cave the entrance "
            + "collapses behind you.\n" 
            + "The room is lit by a few candles sitting on a "
            + "table in front of you.\n" 
            + "You can go north [n] and south [s]\n\n");
    }
    
    public boolean hasItem(){
        return true; 
    }


    
    
    
    
    
    
}
