/**
 * @Author:
 * @Date: 2024-08-09 18:21:22
 * @LastEditors: 
 * @LastEditTime: 2024-08-09 19:59:46
 * @FilePath: src/main/java/pattern/proxyPattern/ProxyImage.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.proxyPattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;
    
    public ProxyImage(){
        
    }
    
    public ProxyImage(String filename){
        this.filename = filename;
    }
    
   
    public void display(){
        
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
