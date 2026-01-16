/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class Animal {
    public String Name;
    public Animal()
    {}
    public Animal(String Name) {
        this.Name = Name;
    }
    public void Keu(){
        System.out.println(this.Name + " kêu: ... ");
    }
    
}
