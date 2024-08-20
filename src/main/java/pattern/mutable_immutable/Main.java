/**
 * @Author:
 * @Date: 2024-08-08 16:57:02
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 19:08:35
 * @FilePath: src/main/java/pattern/mutable_immutable/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.mutable_immutable;

public class Main {
    public static void main(String[] args) {
        
        Mercedec m = new Mercedec();
        m.name = "text";
        
        Fanar f =  new Fanar("sss", m);
        f.getM().name = "alma";
        
        m.name = "alma";

        System.out.println(f.getM().name);
        
    }
}
