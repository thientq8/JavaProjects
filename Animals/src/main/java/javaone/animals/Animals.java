/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaone.animals;

import Models.*;

/**
 *
 * @author Dell
 */
public class Animals {

    public static void main(String[] args) {        
        Animal ani1 = new Animal("Ani1");
        Animal ani2 = new Chicken("Ani2");
        Animal ani3 = new Duck("Ani3");
        ani1.Keu();
        ani2.Keu();
        ani3.Keu();     
    }
}
