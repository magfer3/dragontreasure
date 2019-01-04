/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rooms;

import dragonTreasure.Game; 
import java.util.ArrayList; 

/**
 *
 * @author magdalenafernlund
 */
public class GameBoard {
    
    private ArrayList<Room> dungeon = new ArrayList<Room>(); 
    private Game game; 
    private Room currentRoom; 
    
    public GameBoard(Game game) {
        //lägg till alla rum
        dungeon.add(new Room1()); 
        
        this.game = game; 
        
        
    }
    
}
