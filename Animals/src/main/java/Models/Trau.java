/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author huutr
 */
public class Trau extends Animal_4chi {

    public Trau() {
    }

    public Trau(String Name) {
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
        System.out.println(this.Name + " kêu ngọ ngọ ngọ ngọ");
    }    
}