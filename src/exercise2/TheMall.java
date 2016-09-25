/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Com2-demo
 */
public class TheMall {
    
    static int totalIncome = 0;
    
    static void printTotalIncome(){
        System.out.println("Today total income = " + totalIncome);
        
    }
    public static void main(String args[]){
    
    Customer customer1 = new Customer();
    customer1.shopping();
    
    Customer customer2 = new Customer();
    customer2.shopping();
    
    }
}
