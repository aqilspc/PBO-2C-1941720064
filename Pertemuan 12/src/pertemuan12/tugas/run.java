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
public class run {
    public static void main(String[] args) {
        WalkingZombie wz=new WalkingZombie(100,1);
        JumpingZombie jz=new JumpingZombie(100,2);
        Barrier b=new Barrier(100);
        Plant p =new Plant();
        System.out.println(""+wz.getZombieInfo());
        System.out.println("Jumping Zombie Data =");
        System.out.println(""+jz.getZombiInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("------------------------");
        System.out.println("Walking Zombie Data =");
        for (int i = 0; i < 4; i++) {//Destroy the enemies 4 times
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);   
        }
        System.out.println(""+wz.getZombiInfo());
        System.out.println("Jumping Zombie Data =");
        System.out.println(""+jz.getZombiInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
