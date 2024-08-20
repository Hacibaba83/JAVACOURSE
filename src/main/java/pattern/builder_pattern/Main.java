package pattern.builder_pattern; /**
 * @Author:
 * @Date: 2024-08-08 19:53:37
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 22:30:57
 * @FilePath: src/main/java/pattern/builder_pattern/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */

import pattern.builder_pattern.Fanar;
import pattern.builder_pattern.Fanar.Fanar_Builder;

public class Main {
    public static void main(String[] args) {

        Fanar_Builder builder = Fanar.builder();
        builder.setName("dd");
        Fanar f = builder.build();
        System.out.println(f.getName());
        builder.setName("ewew");
        Fanar f2 = builder.build();
        System.out.println(f2.getName());
        
    }
}
