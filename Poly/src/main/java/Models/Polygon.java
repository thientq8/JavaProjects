/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Polygon {
    public String Name;

    public Polygon(String Name) {
        this.Name = Name;
    }

    public Polygon() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    public void tinhCV(){
        System.out.println("Tính chu vi hình " + this.Name);
    }
    public void tinhDT(){
        System.out.println("Tính diện tích hình " + this.Name);
    }    
}
