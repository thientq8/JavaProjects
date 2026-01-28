/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public abstract class Animal {

    public String Name;
    public int Chi;// 2 chân hay 4 chân

    // Khai báo không có ruột
    public abstract void Keu();

    public abstract void Chay();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getChi() {
        return Chi;
    }

    public void setChi(int Chi) {
        this.Chi = Chi;
    }

}
