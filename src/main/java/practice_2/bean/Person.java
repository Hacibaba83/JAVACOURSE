/**
 * @Author:
 * @Date: 2024-08-12 17:24:48
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 15:09:51
 * @FilePath: src/main/java/practice_2/bean/Person.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class Person implements Serializable {
    private String name;
    private String surname;
    private int age;

    Person() {

    }

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

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

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
