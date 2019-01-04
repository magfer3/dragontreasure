/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Board;

/**
 *
 * @author magdalenafernlund
 */
public class Monster {
    
    private int bodypoint; 
    private int damage; 

    public Monster() {
        this.bodypoint = 8;
        this.damage = 1;
    }
    
    public String getName(){
        return "beast";
    }

    public int getBodyPoint() {
        return bodypoint;
    }

    public int getDamage() {
        return damage;
    }

    public void setBodyPoint(int bodypoint) {
        this.bodypoint = bodypoint;
    }
    

    
    
    
    
    
}
