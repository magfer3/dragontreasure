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
public abstract class Room {
    /*private boolean hasMonster = false; 
    private boolean hasTreasure = false; 
    private boolean isExit = false: 
    */ 
    
    private Room toNorth; 
    private Room toSouth;
    private Room toEast ;
    private Room toWest;
    
    public Room() {
        toNorth = null; 
        toSouth = null;
        toEast = null;
        toWest = null;
        
        }
        

    public abstract String roomName();
    
    //Prints info about the room entered. 
    //Any items present? Any monsters present?
    
    public abstract void PrintRoomInfo();
    
    //har rummet skatten?
    public boolean hasTreasure(){
        return false; 
    }
    
    //är rummet exit? 
    public boolean hasExit(){
        return false; 
    }
    
    //har rummet monster?
    public boolean hasMonster(){
        return false; 
    }
    
    //har rummet items? 
    public boolean hasItem(){
        return false; 
    }
    
    Room toNorth() {
        return toNorth;
    }


    public Room toSouth() {
        return toSouth;
    }


    public Room toEast() {
        return toEast; 
    }


    public Room toWest() {
        return toWest; 
    }
    
    
}