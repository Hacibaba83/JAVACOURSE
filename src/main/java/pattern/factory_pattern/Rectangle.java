/**
 * @Author:
 * @Date: 2024-08-10 14:21:15
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 14:21:22
 * @FilePath: src/main/java/pattern/factory_pattern/Rectangle.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.factory_pattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
