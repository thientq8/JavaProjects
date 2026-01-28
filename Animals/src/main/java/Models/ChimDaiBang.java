/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LENOVO
 */
public class ChimDaiBang extends Animal {

    public ChimDaiBang() {
    }

    public ChimDaiBang(String Name) {
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
        System.out.println(this.Name + "Kêu: \n kii-iii-iiii \n kee-eee-eee \n kyaaakk.... "); 
    }   

    @Override
    public void Chay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
