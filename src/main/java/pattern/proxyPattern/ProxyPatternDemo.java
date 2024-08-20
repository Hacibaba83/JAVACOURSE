/**
 * @Author:
 * @Date: 2024-08-09 18:30:08
 * @LastEditors: 
 * @LastEditTime: 2024-08-09 19:59:46
 * @FilePath: src/main/java/pattern/proxyPattern/ProxyPatternDemo.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.proxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = ObjectCreator.createObject(RealImage.class);
        
        image.display();
        System.out.println("");
        image.display();
    }
}
