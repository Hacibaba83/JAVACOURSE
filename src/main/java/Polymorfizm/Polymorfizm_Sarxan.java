/**
 * @Author:
 * @Date: 2024-08-04 16:30:41
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 16:35:27
 * @FilePath: src/main/java/Polymorfizm/Polymorfizm_Sarxan.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm;

public class Polymorfizm_Sarxan extends Polymorfizm_Azay{
    
    public void methodInSarxan(){
       super.methodInAzay1(); 
       methodInAzay1();
    }
    
    public void methodInSarxan2(){
        
    }
    
    public void methodInAzay1(){
        System.out.println("Serxan 1");    
    }
    
    
}
