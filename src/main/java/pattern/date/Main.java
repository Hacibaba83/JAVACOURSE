/**
 * @Author:
 * @Date: 2024-08-10 17:22:17
 * @LastEditors: 
 * @LastEditTime: 2024-08-10 18:38:56
 * @FilePath: src/main/java/pattern/date/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dt = sdf.format(d);
        String s  = "01-11-2024";
        Date d1 = sdf.parse(s);
        String dt2 = sdf.format(d1);
        System.out.println(dt2);
        System.out.println(dt);

        Scanner sc = new Scanner(System.in);
        System.out.println("type your birthday");
        String datesSTR = sc.nextLine();
        Date dClient = sdf.parse(datesSTR);
        
        Date dMe = sdf.parse("08-01-1993");
        
        long client = dClient.getTime();
        long me = dMe.getTime();
        long diff = client - me;

        System.out.println(diff/(24*60*60*1000)/365);
        
    }
}
