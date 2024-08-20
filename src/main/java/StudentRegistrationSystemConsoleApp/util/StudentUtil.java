/**
 * @Author:
 * @Date: 2024-08-03 18:23:16
 * @LastEditors: 
 * @LastEditTime: 2024-08-03 21:56:17
 * @FilePath: src/main/java/StudentRegistrationSystemConsoleApp/util/StudentUtil.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StudentRegistrationSystemConsoleApp.util;

import StudentRegistrationSystemConsoleApp.beans.Student;
import StudentRegistrationSystemConsoleApp.main.Config;

public class StudentUtil {

    //++FILL STUDENTS
    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        String className = MenuUtil.requireClassName();
        int age = MenuUtil.requireAge();

        Student st = new Student(name, surname, age, className);

        return st;
    }
    //--FILL STUDENTS

    //++PRINT ALL REGISTERED STUDENTS
    public static void printAllRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {//NullPointerException
            Student st = Config.students[i];
            System.out.println((i + 1) + " - " + st.getFullInfo());
        }
    }
    //--PRINT ALL REGISTERED STUDENTS

    //++REGISTER STUDENTS
    public static void registerStudents() {
        int count = InputUtil.requireNumber("Neche telebe qeydiyyatdan kechecek?");

        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + " Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        MenuUtil.showSuccesOpMessage();
        StudentUtil.printAllRegisteredStudents();
    }
    //--REGISTER STUDENTS


    //++FIND STUDENTS AND PRINT
    public static void findStudentAndPrint() {
        String text = InputUtil.requireText("type name, surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }
    //--FIND STUDENTS AND PRINT

    //++FIND STUDENTS
    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }
    //--FIND STUDENTS

    //++UPDATE 
    public static void updateStudentWithNewObject() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Nechenci adami deyishmek isteyirsiz?");
        System.out.println("Yeni melumatlari daxil et!");
        Student s = StudentUtil.fillStudent();
        Config.students[i - 1] = s;
    }

    public static void updateStudentWithSameObject() {
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Nechenci adami deyishmek isteyirsiz?");
        System.out.println("Yeni melumatlari daxil et!");
        Student selectedStudent = Config.students[i - 1];

        String changeParams = InputUtil.requireText("Neleri deyishmek isteyirsiz? mes. 'name' ve ya 'surname'");
        if (changeParams.contains("'name'")) {
            selectedStudent.setName(MenuUtil.requireName());
        }
        if (changeParams.contains("'surname'")) {
            selectedStudent.setSurname(MenuUtil.requireSurname());
        }
        if (changeParams.contains("'classname'")) {
            selectedStudent.setSurname(MenuUtil.requireClassName());
        }
        if (changeParams.contains("'age'")) {
            selectedStudent.setAge(MenuUtil.requireAge());
        }
    }
    
    public static void updateStudentWithSplit(){
        StudentUtil.printAllRegisteredStudents();
        int i = InputUtil.requireNumber("Nechenci adami deyishmek isteyirsiz?");
        System.out.println("Yeni melumatlari daxil et!");
        Student selectedStudent = Config.students[i - 1];

        String changeParams = InputUtil.requireText("Neleri deyishmek isteyirsiz? mes. name ve ya surname");

        String[] parameters = changeParams.split(",");

        for (int index = 0; index < parameters.length; index++) {

            String param = parameters[index];

            if (param.equalsIgnoreCase("name")) {
                selectedStudent.setName(MenuUtil.requireName());
            }else if (param.equalsIgnoreCase("surname")) {
                selectedStudent.setSurname(MenuUtil.requireSurname());
            }else if (param.equalsIgnoreCase("classname")) {
                selectedStudent.setClassName(MenuUtil.requireClassName());
            }else if (param.equalsIgnoreCase("age")) {
                selectedStudent.setAge(MenuUtil.requireAge());
            }
        }
    }
    //--UPDATE 

}
