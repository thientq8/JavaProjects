/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package DemoAbstract;

import Models.*;

/**
 *
 * @author Dell
 */
public class DemoAbstract {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Cho cho = new Cho(); 
        // Không the new Cho(); vì đây là lớp trừu tượng.
        Ga ga = new Ga();
        ga.Keu();
        ga.Chay();
        Khi khi = new Khi();
        khi.Keu();
        khi.Chay();
    }
}
