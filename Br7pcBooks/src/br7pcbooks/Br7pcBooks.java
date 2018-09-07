/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br7pcbooks;

import static br7pcbooks.Category.*;

/**
 *
 * @author brianrobinson
 */
public class Br7pcBooks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book book1 = new Book("Grant", "Ron Chernow");
        
        book1.setPrice((int) 22.00);
        book1.setCategory(HISTORY);
        
        Book book2 = new Book("Goodnight Moon","Margaret",8.94,CHILDREN);
        
        Book book3 = new Book();
        
        book3.setName("The Martian");
        book3.setAuthor("Andy Weir");
        book3.setPrice((int) 15.63);
        book3.setCategory(SCI_FI);
        
        System.out.println("\n\nBook 1: ");
        System.out.println("Name: "+ book1.getName() +" \nAuthor: " + book1.getAuthor() + " \nPrice: " + book1.getPrice() + "\nCategory: " + book1.getCategory() + " \nVersion: " + book1.getVersion());
        
        System.out.println("\n\nBook 2: ");
        System.out.println("Name: "+ book2.getName() +" \nAuthor: " + book2.getAuthor() + " \nPrice: " + book2.getPrice() + "\nCategory: " + book2.getCategory() + " \nVersion: " + book2.getVersion());
        
        System.out.println("\n\nBook 3: ");
        System.out.println("Name: "+ book3.getName() +" \nAuthor: " + book3.getAuthor() + " \nPrice: " + book3.getPrice() + "\nCategory: " + book3.getCategory() + " \nVersion: " + book3.getVersion());
        
        System.out.println("\nNumber of Books: " + Book.numberOfBooks);
    }
    
}
