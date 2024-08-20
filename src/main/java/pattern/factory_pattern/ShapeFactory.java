/**
 * @Author:
 * @Date: 2024-08-10 14:25:08
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 14:25:11
 * @FilePath: src/main/java/pattern/factory_pattern/ShapeFactory.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.factory_pattern;

public class ShapeFactory {

    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}