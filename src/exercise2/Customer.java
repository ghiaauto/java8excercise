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
public class Customer {
    
    void shopping(){
        ShoppingCart cart = new ShoppingCart();
        
        TheMall.totalIncome = TheMall.totalIncome + cart.checkout(price);
      
        
    }
    
}
