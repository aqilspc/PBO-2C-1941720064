/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakikum6pbo.percobaan2;

/**
 *
 * @author Aqil
 */
public class classA {
     private int x, y;
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void getNilai(){
        System.out.println("nilai x:" + x);
        System.out.println("nilai y:" + y);
    }
}
