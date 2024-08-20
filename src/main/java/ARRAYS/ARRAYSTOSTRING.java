/**
 * @Author:
 * @Date: 2024-07-25 10:50:03
 * @LastEditors: 
 * @LastEditTime: 2024-07-25 10:52:14
 * @FilePath: src/main/java/ARRAYS/ARRAYSTOSTRING.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package ARRAYS;
import java.util.Arrays;

public class ARRAYSTOSTRING {
    //TODO      ARRAYS TO STRING
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(arr));

        System.out.println("");

        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            String sonu = (i != arr.length-1) ? "," : "";
            s += arr[i] + sonu;
        }
        s += "]";
        System.out.println(s);   
    }

}
