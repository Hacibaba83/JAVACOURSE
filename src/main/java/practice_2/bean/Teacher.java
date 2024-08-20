
/**
 * @Author:
 * @Date: 2024-08-12 17:27:04
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 15:08:59
 * @FilePath: src/main/java/practice_2/bean/Teacher.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.bean;

import StudentRegistrationSystemConsoleApp.beans.Student;

@SuppressWarnings("serial")
public class Teacher extends Person{

    private String schoolName;
    private double salary;
    private Student[] student;
    
   public String getScloohName(){
       return schoolName;
   } 
   
   public void setSchoolName(String schoolName){
       this.schoolName = schoolName;
       
   }
   
   public double getSalary(){
       return salary;
   }
   
   public void setSalary(double salary){
       this.salary = salary;
   }

    public String getSchoolName() {
        return schoolName;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}
