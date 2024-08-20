/**
 * @Author:
 * @Date: 2024-08-10 14:25:32
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 14:25:45
 * @FilePath: src/main/java/pattern/factory_pattern/FactoryPatternDemo.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.factory_pattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of square
        shape3.draw();
    }
}