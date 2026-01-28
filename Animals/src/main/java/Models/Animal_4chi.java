/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author huutr
 */
public abstract class Animal_4chi extends Animal {
    
    
    public Animal_4chi (){
        
    }
    public Animal_4chi(String Name){
        super(Name);
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
    
    @Override
    public void Keu (){
        System.out.println("Động vật 4 chi đang kêu:");
    }
    public void dichuyen(){
        System.out.println("Động vật 4 chi di chuyển bằng 4 cẳng");
    }
}
