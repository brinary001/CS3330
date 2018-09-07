
package br7pcbooks;

/**
 *
 * @author brianrobinson
 */
public class Book {

    private String name;
    private String author;
    private double price;
    private Category category;
    private int version;
    public static int numberOfBooks = 0;

    public Book() {
        this.name = "";
        this.author = "";
        this.numberOfBooks++;
    }

    public Book(String name, String author) {
        this();
        this.name = name;
        this.author = author;
        this.version = 0;
    }

    public Book(String name, String author, Double price, Category category) {
        this(name, author);
        this.price = price;
        this.category = category;
        this.version = 1;
    }

    public void setName(String name) {
        this.name = name;
        this.version++;
    }

    public void setAuthor(String author) {
        this.author = author;
        this.version++;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
        this.version++;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getVersion() {
        return this.version;
    }

    /*void setPrice(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
