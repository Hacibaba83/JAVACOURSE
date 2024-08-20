/**
 * @Author:
 * @Date: 2024-07-28 12:56:17
 * @LastEditors: 
 * @LastEditTime: 2024-07-28 13:17:39
 * @FilePath: src/main/java/CONSTRUCTORLAR/USER_CONST.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package CONSTRUCTORLAR;

import OBYEKT_ICHI_OBYEKT.Student;

public class USER_CONST {

        private String name;
        private String surname;
        private int age;
        private String companyName;
        public static int objectCount = 0;
        
        //TODO          BURADA ELAN METOD "CONSTRUKTOR" ADLANIR
        public USER_CONST(){
                this.name = "name is undefined";
                this.surname = "surname is undefined";
                this.age = 0;
                obyektYaradildigiZamanMeniMutleqChagir();
                objectCount++;        
        }
        
        public void obyektYaradildigiZamanMeniMutleqChagir(){
                System.out.println("Men burada cox vacib ish gorecem");
        }
        
        
        public void setName(String name) { 
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
