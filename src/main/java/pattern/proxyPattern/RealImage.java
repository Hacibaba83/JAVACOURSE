/**
 * @Author:
 * @Date: 2024-08-09 16:54:59
 * @LastEditors: 
 * @LastEditTime: 2024-08-09 19:59:46
 * @FilePath: src/main/java/pattern/proxyPattern/RealImage.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.proxyPattern;


public class RealImage implements Image {
    
    private String fileName;
    
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    
    public void display(){
        System.out.println("Display " + fileName);
    }
    
    private void loadFromDisk(String fileName){
        System.out.println("Loading "+ fileName);
    }
}
