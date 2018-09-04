/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br7pclanguagebasics;

import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author brianrobinson
 */
public class Br7pcLanguageBasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char c1 = 'A';
        char c2 = 65;
        short qualityScore = 70;
        float gravitation = (float)9.8;
        float weight = 50;
        boolean sunny = true;
        boolean warm = false;
        String hourString = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime()); 
        int hour = Integer.parseInt(hourString);
        String minString = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime()); 
        int minute = Integer.parseInt(minString);
        String greeting = "Bonjour";
        String myPawPrint = "br7pc";
        
        if (c1 == c2) {
            System.out.println("\n" + c1 + " and " + c2 + " are the same\n");
        }
        else {
            System.out.println("\n" + c1 + " and " + c2 + "are NOT the same\n");
        }
        
        if (qualityScore >= 0 && qualityScore <= 60) {
            System.out.println("The quality is bad.\n");
        }
        else {
            System.out.println("Good quality\n");
        }
        
        float force = weight * gravitation;
        
        System.out.printf("Force = %f\n\n", force);
        
        if (sunny == true && warm == true) {
            System.out.println("Go barbeque.\n");
        } else if (sunny == false && warm == true) {
            System.out.println("Go hiking.\n");
        }
        else {
            System.out.println("Stay home.\n");
        }
            
        switch (hour) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("\nThe current time is " + hour + ":" + minute + " and it is the NIGHT\n");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("\nThe current time is " + hour + ":" + minute + " and it is the MORNING\n");
                break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                System.out.println("\nThe current time is " + hour + ":" + minute + " and it is the AFTERNOON\n");
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                System.out.println("\nThe current time is " + hour + ":" + minute + " and it is the EVENING\n");
                break;
            case 23:
                System.out.println("\nThe current time is " + hour + ":" + minute + " and it is the NIGHT\n");
                break;
            default:
                System.out.println("\nYou have the wrong time.\n");
                break;
        }
        
        for (int count = 2; count <= 6; count++) {
            if ((count % 3) == 0) {
                System.out.println("Count: " + count);
            }
        }
        
        int countDown = 5;
        
        while (countDown > 0) {
            System.out.println("Count Down: " + countDown--);
            
            if (countDown == 0) {
                System.out.println("Houston, we have liftoff!");
            }
        }
        
        invokeMe(greeting, myPawPrint);
        
        }
    
    private static void invokeMe(String greeting, String myPawPrint) {
       String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm").format(Calendar.getInstance().getTime());  
       System.out.println("\n" + greeting +", my PawPrint is " + myPawPrint + " and today's date is "+ timeStamp);
    }

    
}
