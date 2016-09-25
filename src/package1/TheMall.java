/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;
import package2.Customer;

/**
 *
 * @author Com2-demo
 */
public class TheMall {
    
    public static int totalPrice = 0;
    
    public static void main(String args[]){
        Customer customer = new Customer();
        customer.shopping();
               
        System.out.println(totalPrice);
    }
    
}
