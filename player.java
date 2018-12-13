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
    
    
    public player(){

    bodypoint = 10; 
    sword = false; 
    damage = 1; 
    
    }
    
    public void setBodypoint(int bodypoint) {
        this.bodypoint = bodypoint;
    }

    public void setSword(boolean sword) {
        this.sword = sword;
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

}
    
