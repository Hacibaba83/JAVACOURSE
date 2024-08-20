/**
 * @Author:
 * @Date: 2024-07-28 13:18:45
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 14:21:59
 * @FilePath: src/main/java/REKRUSIYA/UserRek.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package REKRUSIYA;

public class UserRek {
    private String name;
    private String surname;
    private int age;
    private String companyName;
    public static int objectCount = 0;

    //TODO          BURADA ELAN METOD "CONSTRUKTOR" ADLANIR
    public UserRek() {
        //TODO      THIS() Konstruktorlarin chagrilmasi
        this("undefined", "undefined", -1);
        System.out.println("User 1");
        //this.name = "name is undefined";
        //this.surname = "surname is undefined";
        //this.age = 0;
        //obyektYaradildigiZamanMeniMutleqChagir();
        objectCount++;
    }

    public UserRek(String name, String surname) {
        this(name, surname, -1);
        System.out.println("User 2");
        this.name = name;
        this.surname = surname;
    }
    
    public UserRek(String name, String surname, int age) {
        System.out.println("User 3");
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void obyektYaradildigiZamanMeniMutleqChagir() {
        System.out.println("Men burada cox vacib ish gorecem");
    }


    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Adi zehmet olmasa daxil edin");
            return;
        }
        this.name = name;
    }


    public String getName() {
        return this.name;//tr5TODO     THIS.VARIABLE
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
