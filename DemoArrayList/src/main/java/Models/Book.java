/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Book {
    String ID;
    String Name;
    String Author;
    int Year;
    static int TongSach;

    public Book(String ID, String Name, String Author, int Year) {
        TongSach +=1; 
        this.ID = ID;
        this.Name = Name;
        this.Author = Author;
        this.Year = Year;
    }

    public Book(String ID, String Name) {
        TongSach +=1;
        this.ID = ID;
        this.Name = Name;
    }

    public Book() {
        TongSach +=1;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
    
    public void printThongtin(){
        {
            System.out.println("ID: " + this.getID());
            System.out.println("Name: " + this.getName());
            System.out.println("Author: " + this.getAuthor());
            System.out.println("Year: " + this.getYear());
        }
    }
    
}
