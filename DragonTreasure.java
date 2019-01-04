/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import player.Player;
import java.util.Scanner;
import Board.*;

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
        
        //Initiates a new Player
        Player player = new Player(input.nextLine()); 
        
        //Game starts
        System.out.printf("\nWelcome %s to your treasure hunt. \n"
                + "Beware of the dragon! You are standing outside a cave. \n"
                + "There is a smell of sulfur coming from the opening. " 
                + "The cave opening is to your east. \n"
                + "Write \"e\" and press [Enter] to enter the cave: \n\n", player.getName());
        
        
        //Continue game until players bodypoint reaches 0 or less
        while(player.getBodyPoint() > 0){
        
        //if user enters anything other tjan command for Enter
        while(!input.nextLine().equals("e")){
            System.out.println("You cant go anywhere else. Do you want to enter? "
                    + "[y] / [n] ?\n");
            if(input.nextLine().equals("y")){
                break;  
            }else{
                System.out.println("Thank you! See you next time!");
                System.exit(0);
            }
        
            

        
            
        }
        
            System.out.println("You have lost! Better luck next time!");
            

        
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
    
            public void action(String c){
        //
/*       switch (c){
            case "n": 
                System.out.println("\nYou see a sword next to a dead body "
                        + "on the floor.\n" 
                        + "You can pick up the sword [p], and go [s] or [e]");
            case "s": ;
                System.out.println("\nYou see a key laying on the floor.\n"
                        + "You can pick up the key [p], and go [w] or [e]");
            case "e": 
                System.out.println("\nYou can't go there.");
            case "w": 
                System.out.println("\nYou can't go there.");
        }
*/        
        
    }
            //when a player enters a room with a monster in it (Beast or Dragon) 
            //it gets attacked. Player and monster take turn in attacking, until
            //one has reached a bodypoint of 0. 
           public boolean attacked(Monster monster, Player player){
               
                boolean playerWins = false; 
            
                while(player.getBodyPoint() > 0 && monster.getBodyPoint() > 0 ){
                    System.out.printf("A %s attacks you and does %s damage", monster.getName(), monster.getDamage());
                    player.setBodyPoint(player.getBodyPoint() - monster.getDamage());   
                    System.out.printf("you attack the %s and does %s damage", monster.getName(), monster.getDamage());
                    monster.setBodyPoint(monster.getBodyPoint() - player.getDamage()); 
                }
                if (player.getBodyPoint() >0){
                    playerWins = true; 
                }
                return playerWins; 
                }
                
            
                
               
                
                //Ska det här vara här eller i "spelet"? 
                /*if (player.getBodypoint() >0){
                    System.out.print("You defeat the beast, but you only have %s hitpoints left. Will it be enough to fight another monster?");
                }
                */
            
           
    
}
