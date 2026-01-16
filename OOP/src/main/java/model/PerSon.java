/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Dell
 */
public class PerSon {

    // KHAI BÁO DANH SÁCH CÁC 
    // THUỘC TÍNH CỦA LỚP PERSON
    /*============================*/
    private String unique_id;
    private String name;// default đặc tả truy xuất
    int age;
    String city;
    public  String gender;

    /*============================*/
    //KHAI BÁO CONSTRUCTOR KHÔNG CÓ THAM SỐ ĐẦU VÀO
    public PerSon() {

    }

    public PerSon(String unique_id, String name, int age, String city, String gender) {
        this.unique_id = unique_id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.gender = gender;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public PerSon(String unique_id, String name) {
        this.unique_id = unique_id;
        this.name = name;
    }

    public String getPersonInformation() {
        return this.unique_id + " - " + this.name + " - " + this.gender + " - " + this.city;
    }
    public String getPersonInformation(String infor) {
        String result = "";
        result = switch (infor) {
            case "a" -> this.unique_id;
            case "b" -> this.name;
            case "c" -> this.gender;
            default -> "Không có gì";
        };
        return result;
    }
    public String getPersonInformation(int infor) {
        String result = "";
        result = switch (infor) {
            case 1 -> this.unique_id;
            case 2 -> this.name;
            case 3 -> this.gender;
            default -> "Không có gì";
        };
        return result;
    }
    
    public String getPersonInformation(String infor1, String infor2, 
            String infor3) {
        return infor1 + this.unique_id +  " - " + infor2 + this.name 
                + " - " + infor3 + this.gender ;
    }
    
    
    // KHAI BÁO CÁC PHƯƠNG THỨC 
    // CỦA LỚP PERSON
    public void Eat() {
        System.out.println("Eating ...");
    }

    public void Study() {
        System.out.println("Studying ...");
    }

    public void Sleep() {
        System.out.println("Sleeping ...");
    }

    public void Play() {
        System.out.println("Playing ...");
    }

    public void inTen() {
        System.out.println(this.name);
    }

} // END OF PERSON CLASS
