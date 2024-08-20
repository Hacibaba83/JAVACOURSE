/**
 * @Author:
 * @Date: 2024-08-17 12:17:04
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 19:39:31
 * @FilePath: src/main/java/annotation/Teacher.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package annotation;


public class Teacher {

    @BoshOlmasin
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

   // @SuppressWarnings(value = "unchecked")
    public void method(int a) {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
    }
}
