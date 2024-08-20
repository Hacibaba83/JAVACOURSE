/**
 * @Author:
 * @Date: 2024-07-27 13:19:21
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 14:21:59
 * @FilePath: src/main/java/PRIVATE_PUBLIC/UserPrivate.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package PRIVATE_PUBLIC;


public class UserPrivate {
    //TODO      PUBLIC VE PRIVATE acces modifier adlanir
    //TODO      SATICLER non acces modifier adlanir
    //TODO      PRIVATE, GET, SET-den istifade etmekle DEYISHENI ENCAPSULATE edirik
    private String name;//TODO      INSTANCE VARIABLE obyekte aid olan deyishenler bu shekilde adlanir 
    private String surname;
    private int age;
    private String companyName;

    public void setName(String name) { //TODO     INSTANCE METHODLAR obyekte aid olan methodlar bu shekilde adlanir
        if (name.isEmpty()){
            System.out.println("Adi zehmet olmasa daxil edin");
            return;
        }
        this.name = name;
    }

     
    public String getName(){
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
