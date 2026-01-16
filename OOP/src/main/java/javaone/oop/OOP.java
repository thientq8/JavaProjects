/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package javaone.oop;

import model.PerSon;

/**
 *
 * @author Dell
 */
public class OOP {

    public static void main(String[] args) {
        PerSon a = new PerSon("TV0001","Nguyễn Văn An",20,"HN","Nam");
        String result;
        result = a.getPersonInformation();
        System.out.println(result);
        result = a.getPersonInformation("a");
        System.out.println(result);
        result = a.getPersonInformation("b");
        System.out.println(result);
        result = a.getPersonInformation(3);
        System.out.println(result);
        result = a.getPersonInformation("Mã NV ", 
                "Họ tên ", "Giới tính ");
        System.out.println(result);        
    }
}
