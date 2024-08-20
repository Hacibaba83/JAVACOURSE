/**
 * @Author:
 * @Date: 2024-07-28 21:27:49
 * @LastEditors: 
 * @LastEditTime: 2024-08-02 13:09:41
 * @FilePath: src/main/java/StringClassiArxaPlandaNeceIshleyir/MainStringArxaPlan.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package StringClassiArxaPlandaNeceIshleyir;

public class MainStringArxaPlan {


    public static void main(String[] args) {
        //TODO      STINGDE POOL HOVUZ ANLAYISHI VAR
        String s = new String("sss");
        String s2 = "sss";
        String s3 = "sss";
        compareStrs(new String("salam"), new String("salam"));

        System.out.println("|||||||||||||||||||||||||||||");
        Integer i = new Integer(5);
        Integer i2 = new Integer(5);
        
        
        compare(i, i2);

        System.out.println("||||||||||||||||||||");

        //TODO      STRING.VALUEOF()
        String s6 = String.valueOf(5);
        System.out.println(s6);

    }
    

    public static void compare(Integer i1, Integer i2) {
        System.out.println(i1.equals(i2));
    }

    public static void compareStrs(String s1, String s2) {
        System.out.println("metod compare");
        System.out.println(s1.equals(s2));
    }

}
