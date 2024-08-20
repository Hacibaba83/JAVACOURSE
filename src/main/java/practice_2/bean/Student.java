/**
 * @Author:
 * @Date: 2024-08-12 17:35:43
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 15:09:51
 * @FilePath: src/main/java/practice_2/bean/Student.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.bean;

@SuppressWarnings("serial")
public class Student extends Person {
    private String schoolName;
    private double scholarship;

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }


}
