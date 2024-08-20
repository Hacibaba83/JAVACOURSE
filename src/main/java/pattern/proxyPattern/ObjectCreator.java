/**
 * @Author:
 * @Date: 2024-08-09 18:31:56
 * @LastEditors: 
 * @LastEditTime: 2024-08-09 19:59:46
 * @FilePath: src/main/java/pattern/proxyPattern/ObjectCreator.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.proxyPattern;

public class ObjectCreator {
    
   public static Image createObject(Class clazz){
      if (clazz == RealImage.class){
         return new ProxyImage() ;
      }
      return null;
      
   } 
}
