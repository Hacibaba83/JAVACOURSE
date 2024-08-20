/**
 * @Author:
 * @Date: 2024-08-04 13:58:23
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 15:49:25
 * @FilePath: src/main/java/StaticBloklar/Inheritance_User.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StaticBloklar;

public class Inheritance_User extends Inheritance_Person {

    public Inheritance_User() {
        this(3);
    }

    public Inheritance_User(int a) {
        this(3, "");
    }

    public Inheritance_User(int a, String st) {
        super("");
    }

    public void foo(){
        super.methodPerson();
    }
    
}
