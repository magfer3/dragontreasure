/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragontreasure;

import java.util.Scanner;

/**
 *
 * @author magdalenafernlund
 */
public class DragonTreasure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Welcome to Dragon Treasure\n" +
        "Write your name and press [Enter] to start a new game...\n");
        
        //Initiates a new player
        player player = new player(input.nextLine()); 
        
        //Game starts
        System.out.printf("\nWelcome %s to your treasure hunt. \n"
                + "Beware of the dragon! You are standing outside a cave. \n"
                + "There is a smell of sulfur coming from the opening. " 
                + "The cave opening is to your east. \n"
                + "Write \"e\" and press [Enter] to enter the cave: \n\n", player.getName());
        

        //Continue game until players bodypoint reaches 0 or less
        while(player.getBodypoint() > 0){
        
        while(!input.nextLine().equals("e")){
            System.out.println("You cant go anywhere else. Do you want to enter? "
                    + "[y] / [n] ?\n");
            if(input.nextLine().equals("y")){
                break;  
            }
        }
            
        System.out.println("\nAs you enter the cave the entrance "
            + "collapses behind you.\n" 
            + "The room is lit by a few candles sitting on a "
            + "table in front of you.\n" 
            + "You can go north [n] and south [s]\n\n");
        
        /*switch (input.nextLine()){
            case "n": 
                System.out.println("\nYou see a sword next to a dead body "
                        + "on the floor.\n" 
                        + "You can pick up the sword [p], and go [s] or [e]");
            case "s": ;
                System.out.println("\nYou see a key laying on the floor.\n"
                        + "You can pick up the key [p], and go [w] or [e]");
        }*/
 
            
        }
        
    }
    
}
