/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12.praktikum;

/**
 *
 * @author Aqil
 */
public class example4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5,"R-1");
        ow.pay(eBill);//pay for electricity bill
        System.out.println("-------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedik",500);
        ow.pay(pEmp);//pay for permanent employee
        System.out.println("-------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("----------------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
        
        
    }
}
