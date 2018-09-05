/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br7pchelloworld;



/**
 *
 * @author Brian Robinson
 */

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  

public class Br7pcHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World!");
        
        String myPawPrint = "br7pc";
        
        System.out.println("My pawprint is " + myPawPrint);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Today's date is " + (dtf.format(now)));
        //System.out.println(dtf.format(now));
        
        
    }
    
}
