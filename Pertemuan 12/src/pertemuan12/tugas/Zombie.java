/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.tugas;

/**
 *
 * @author Aqil
 */
abstract class Zombie implements Destroyable {
    protected int health,level;
    
    abstract public void heal();

    @Override
    abstract public void destroyed();
    
    String getZombiInfo(){
        return "Health = " + this.health + "\n" + "level = "+this.level;
       
    }
    
}
