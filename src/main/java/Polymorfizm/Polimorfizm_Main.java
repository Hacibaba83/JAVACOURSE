/**
 * @Author:
 * @Date: 2024-08-04 16:28:00
 * @LastEditors: 
 * @LastEditTime: 2024-08-04 17:20:40
 * @FilePath: src/main/java/Polymorfizm/Polimorfizm_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Polymorfizm;

public class Polimorfizm_Main {

    public static void main(String[] args) {
// 1       Polymorfizm_Sarxan s = new Polymorfizm_Sarxan();
// 1      Polymorfizm_Tural t = new Polymorfizm_Tural();
// 1      test(s);
// 1      test(t);

        Polymorfizm_Sarxan s = new Polymorfizm_Sarxan();
        Polymorfizm_Azay a = s; // upcasting
        Polymorfizm_Sarxan ss = (Polymorfizm_Sarxan) a; //downcasting
    }
    
//1    public static void test(Polymorfizm_Azay a){
//1        if (a instanceof Polymorfizm_Sarxan) {
//1            Polymorfizm_Sarxan a2 = (Polymorfizm_Sarxan) a;
//1        } else if (a instanceof Polymorfizm_Tural) {
//1            Polymorfizm_Tural a2 = (Polymorfizm_Tural) a;
//1        }
//1    }
    
    
    
    
}
