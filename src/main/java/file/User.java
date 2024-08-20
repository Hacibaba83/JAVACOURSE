/**
 * @Author:
 * @Date: 2024-08-11 18:52:49
 * @LastEditors: 
 * @LastEditTime: 2024-08-11 19:44:58
 * @FilePath: src/main/java/file/User.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package file;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public transient String password;
    public int i;
}
