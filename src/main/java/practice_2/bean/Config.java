/**
 * @Author:
 * @Date: 2024-08-14 14:40:37
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 15:08:12
 * @FilePath: src/main/java/practice_2/bean/Config.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package practice_2.bean;

import practice_2.util.FileUtility;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Config implements Serializable {

    private static Config config = null;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];
    private static boolean leggedIn;
    private static final String fileName = "app.obj";

    public static void save(){
        FileUtility.writeObjectToFile(Config.instance(), fileName);
    }
    
    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize(fileName);
        if (obj == null) {
            return;
        }
        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void appendStudent(Student s) {
        Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length - 1] = s;
        students = newStudents;
    }

    public void appendTeacher(Teacher s) {
        Teacher[] newTeacher = new Teacher[teachers.length + 1];
        for (int i = 0; i < teachers.length; i++) {
            newTeacher[i] = teachers[i];
        }
        newTeacher[newTeacher.length - 1] = s;
        teachers = newTeacher;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static boolean isLeggedIn() {
        return leggedIn;
    }

    public static void setLeggedIn(boolean leggedIn) {
        Config.leggedIn = leggedIn;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }
}
