/**
 * @Author:
 * @Date: 2024-08-02 20:17:59
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 20:37:09
 * @FilePath: src/main/java/TAPSHIRIQLAR/Exercises_17.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package TAPSHIRIQLAR;

public class Exercises_17 {
    public static void main(String[] args) {
        String metn = "Hello World";
        StringBuilder swapped = new StringBuilder();

        for (int i = 0; i <= metn.length() - 1; i++) {
            
            char herif = metn.charAt(i);
           
            if(Character.isUpperCase(herif)){
                swapped.append(Character.toLowerCase(herif));
            } else if (Character.isLowerCase(herif)) {
                swapped.append(Character.toUpperCase(herif));
            }else{
                swapped.append(herif);
            }
        }
        System.out.println(swapped.toString());

    }
}
