/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author 1794421
 */
import java.util.Random;
import java.util.Scanner;
public class JavaApplication3 {

 
    public static void main(String[] args) {
        Random randomObj = new Random();
        int i,a;
        System.out.print("How many number ? : ");
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        for ( int j = 1; j <= i; j++) {
            a= randomObj.nextInt(1000);
            if (a%2 == 0){
            System.out.println(a + " is even");
            }
            else{
                System.out.println(a +" is odd");
            }
        }
        
       
      
    
    }
    
}
