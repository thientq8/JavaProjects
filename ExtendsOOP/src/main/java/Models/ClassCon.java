/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Dell
 */
public class ClassCon extends ClassOngGia {
    public String email;
           String ViSaCard;

    public ClassCon() {
        
        System.out.println("Constructor Cha");
    }

    public ClassCon(String email, String ViSaCard) {
        this.email = email;
        this.ViSaCard = ViSaCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getViSaCard() {
        return ViSaCard;
    }

    public void setViSaCard(String ViSaCard) {
        this.ViSaCard = ViSaCard;
    }
    
}
