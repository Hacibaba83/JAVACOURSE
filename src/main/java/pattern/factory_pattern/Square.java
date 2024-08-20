/**
 * @Author:
 * @Date: 2024-08-10 14:21:55
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 14:21:59
 * @FilePath: src/main/java/pattern/factory_pattern/Square.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.factory_pattern;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}