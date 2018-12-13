/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragontreasure;

/**
 *
 * @author magdalenafernlund
 */
public class player {

    private int bodypoint; 
    private boolean sword; 
    private int damage; 
    private final String name; 
    
    public player(String name){

    bodypoint = 10; 
    sword = false; 
    damage = 1; 
    this.name = name; 
    
    }
    
    public String getName(){
        return name; 
    }
    
    public void setBodypoint(int bodypoint) {
        this.bodypoint = bodypoint;
    }

    public void setSword(boolean sword) {
        this.sword = true;
        setDamage(2);
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBodypoint() {
        return bodypoint;
    }

    public boolean isSword() {
        return sword;
    }

    public int getDamage() {
        return damage;
    }
    
    public void healPotion(){
        setBodypoint(10); 
    }

}
    
