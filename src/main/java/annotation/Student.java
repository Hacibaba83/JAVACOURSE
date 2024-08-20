/**
 * @Author:
 * @Date: 2024-08-17 13:41:29
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 13:42:01
 * @FilePath: src/main/java/annotation/Student.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package annotation;

public class Student {
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
