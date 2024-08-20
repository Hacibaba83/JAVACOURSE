/**
 * @Author:
 * @Date: 2024-07-28 21:50:37
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 12:55:13
 * @FilePath: src/main/java/StringBuilderStringBufer/MainStringBuilderStringBuffer.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StringBuilderStringBufer;

public class MainStringBuilderStringBuffer {
    public static void main(String[] args) {
        String s = "Salam";
        s+=" Necesen";
        s+=" Ishlerin necedr";

        System.out.println(s);
        
        StringBuilder s2 = new StringBuilder();
        s2.append("Salama");
        s2.append(" necesen");
        s2.append(" ishlerin necedir");

        String result = s2.toString();
        
        MainStringBuilderStringBuffer no = new MainStringBuilderStringBuffer();
        System.out.println("Amir skazal =" + no + no.toString());
        System.out.println(result);

        System.out.println("||||||||||");
        char[] arr = {'s', 'a','l','a','m'};
        String m = new String(arr);
        System.out.println(m);

        //TODO      String Buffe SYNchronized  ardicilligi qorumaq thread-da  String Builde nos sinchronized
        System.out.println("|||||StringBuffer||||||||||");
        StringBuffer s3 = new StringBuffer();
        s3.append("Salama");
        s3.append(" necesen");
        s3.append(" ishlerin necedir");

        String result2 = s3.toString();

        System.out.println(result2);
    }
}
