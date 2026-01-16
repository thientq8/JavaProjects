/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class HinhTron extends Polygon {
    public int banKinh;

    public HinhTron(int banKinh, String Name) {
        super(Name);
        this.banKinh = banKinh;
    }

    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public void tinhDT() {
        System.out.println("Diện tích hình tròn: " + this.banKinh*this.banKinh*3.14);
    }

    @Override
    public void tinhCV() {
        System.out.println("Chu vi hình tròn: " + this.banKinh * 2 *3.14);
    }

}
