/**
 * @Author:
 * @Date: 2024-07-25 10:53:41
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:55:40
 * @FilePath: src/main/java/CALCULATOR/MAIN/MAINCLASS.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package CALCULATOR.MAIN;

import CALCULATOR.UTILS.CALCULATOR;

public class MAINCLASS {
    public static void main(String[] args) {
        double result = CALCULATOR.calculate();
        System.out.println("result = "+ result);
    }
    
}
