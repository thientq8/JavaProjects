/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Chicken extends Animal_2chi {

    public Chicken() {
    }

    public Chicken(String Name) {
        super(Name);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public void Keu() {
        System.out.println(this.Name + " kêu chip chip...");
    }    
}
