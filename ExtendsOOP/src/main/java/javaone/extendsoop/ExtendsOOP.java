/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.extendsoop;

import Models.ClassChau;
import Models.ClassCon;
import Models.ClassOngGia;

/**
 *
 * @author Dell
 */
public class ExtendsOOP {

    public static void main(String[] args) {
        ClassOngGia cha = new ClassOngGia("11111111111", "Ông Già", 1000000000.00);
        
        ClassCon con = new ClassCon("11111111","Con");
        con.setQuyDen(2000000000);
        
        ClassChau chau = new ClassChau();
    }
}
