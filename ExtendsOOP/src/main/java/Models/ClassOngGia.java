/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class ClassOngGia extends Object {
    public String CCCD;
    protected String Name;
    private double QuyDen;
            double QuyDo;

    public ClassOngGia() {
        
        System.out.println("Constructor Ông Già");
    }

    public ClassOngGia(String CCCD, String Name, double QuyDen) {
        this.CCCD = CCCD;
        this.Name = Name;
        this.QuyDen = QuyDen;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getQuyDen() {
        return QuyDen;
    }

    public void setQuyDen(double QuyDen) {
        this.QuyDen = QuyDen;
    }

    public void getInfor(){
        System.out.println(this.CCCD);
        System.out.println(this.Name);
        System.out.println(this.QuyDen);
    }
    
    
}
