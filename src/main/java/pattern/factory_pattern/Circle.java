/**
 * @Author:
 * @Date: 2024-08-10 14:23:57
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 14:24:03
 * @FilePath: src/main/java/pattern/factory_pattern/Circle.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.factory_pattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
