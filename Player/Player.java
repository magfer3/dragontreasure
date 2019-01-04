/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author magdalenafernlund
 */
public class Player {

    private int bodypoint; 
    private boolean hasSword; 
    private int damage; 
    private final String name; 
    private boolean hasKey; 
    private boolean hasPotion; 
    
    public Player(String name){

    bodypoint = 10; 
    hasSword = false; 
    damage = 1; 
    this.name = name; 
    
    }
    
    public String getName(){
        return name; 
    }
    
    public void setBodyPoint(int bodypoint) {
        this.bodypoint = bodypoint;
    }

    public void setSword(boolean sword) {
        this.hasSword = true;
        setDamage(2);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBodyPoint() {
        return bodypoint;
    }

    public boolean hasSword() {
        return hasSword;
    }

    public int getDamage() {
        return damage;
    }
    
    public void pickupPotion(){
        this.hasPotion = true; 
    }
    
    public void drinkHealPotion(){
        if(this.hasPotion = true){
           setBodyPoint(10); 
        }
        else{
            System.out.println("You do not have a potion.");
        }
    }

    public void pickupKey() {
        this.hasKey = true;
    }

    public boolean hasKey() {
        return hasKey;
    }
    

    
    
    

}
    
