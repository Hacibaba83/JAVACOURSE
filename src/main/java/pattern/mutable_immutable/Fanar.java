/**
 * @Author:
 * @Date: 2024-08-08 16:57:10
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 19:09:41
 * @FilePath: src/main/java/pattern/mutable_immutable/Fanar.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.mutable_immutable;

import pattern.singelstone.Device;

public class Fanar extends Device {

    private String name = null;
    private Mercedec m = null;


    public Mercedec getM() {
        Mercedec mm = new Mercedec();
        mm.name = m.name;
        return mm;
    }

    public Fanar (String name, Mercedec m){
        this.name = name;
        
        Mercedec mm = new Mercedec();
        mm.name = m.name;
        this.m = mm;
    }
    
    public String getName() {
       return name;
    }

     public Fanar() {

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
