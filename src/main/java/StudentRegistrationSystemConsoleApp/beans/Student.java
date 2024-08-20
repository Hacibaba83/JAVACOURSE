/**
 * @Author:
 * @Date: 2024-08-03 17:43:08
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 19:17:59
 * @FilePath: src/main/java/StudentRegistrationSystemConsoleApp/beans/Student.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StudentRegistrationSystemConsoleApp.beans;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;

    public Student() {
    }

    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    
    public String getFullInfo(){
        return  this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getClassName();
    }
}
