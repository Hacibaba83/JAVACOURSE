/**
 * @Author:
 * @Date: 2024-08-08 16:57:10
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 18:32:30
 * @FilePath: src/main/java/pattern/singelstone/Fanar.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.singelstone;

public class Fanar extends Device {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Fanar() {

    }

    private static Fanar f = null;
    
    public static Fanar instance() {
        if (f == null) {
            f = new Fanar();
        }
        return f;
    }

    public void drive() {
        System.out.println("Fanar drive");
    }
}
