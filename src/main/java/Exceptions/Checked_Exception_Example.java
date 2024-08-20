/**
 * @Author:
 * @Date: 2024-08-07 11:10:41
 * @LastEditors: 
 * @LastEditTime: 2024-08-07 11:49:01
 * @FilePath: src/main/java/Exceptions/Checked_Exception_Example.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class Checked_Exception_Example {
    public static void main(String[] args) {
        try {
            foo();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void foo() throws SQLException, IOException {
        throw new IOException();

    }
}
