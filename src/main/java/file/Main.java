/**
 * @Author:
 * @Date: 2024-08-10 21:54:44
 * @LastEditors: 
 * @LastEditTime: 2024-08-12 10:33:43
 * @FilePath: src/main/java/file/Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package file;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] data = FileUtility.readBytes("test.png");
        FileUtility.writeBytes("test2.png", data);

//        byte[] data2 = NioFileUtility.resdBytes("test.png");
//        NioFileUtility.writeBytes(data2, "test3.png");

//        User u = new User();
//        u.name = "test";
//        u.password = "password";
//        FileUtility2.writeObjectToFile(u, "test.obj");

        User u2 = (User) FileUtility.readFileDeserialize("test.obj");
        System.out.println(u2.name);
        System.out.println(u2.password);
        
        FileUtility.ReadFroSiteWithTimeOut("https://tap.azstatic.com/uploads/full/2023%2F11%2F01%2F16%2F46%2F02%2F02114bd1-d92b-46c6-87a4-27c8d2f97889%2F88071_GdqqXuloxyjJUxrwm7G5Ng.jpg", "tapaz.jpg");
        
    }
}
