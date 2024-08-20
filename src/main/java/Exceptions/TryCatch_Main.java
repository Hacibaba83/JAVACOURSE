/**
 * @Author:
 * @Date: 2024-08-06 19:57:50
 * @LastEditors: 
 * @LastEditTime: 2024-08-06 20:19:04
 * @FilePath: src/main/java/Exceptions/TryCatch_Main.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package Exceptions;

public class TryCatch_Main {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 0;
            Object obj = null;
            System.out.println(obj.toString());

//        }catch (ArithmeticException ex){
//            System.out.println("Riyazi xeta baash verdi"); 
//        }catch (NullPointerException ex){
//            System.out.println("Null xeta bash verdi");
//        }catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("Array xeta bash verdi");
//        }catch (Exception ex){
//            System.out.println("Bashqa bir xeta bash verdi. "+ex.getClass().getName());
//        }
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.println("Menim axtardigim uchxetadan biri bash verdi");
        } catch (Exception ex) {
            System.out.println("Bashqa bir xeta bash verdi. " + ex.getClass().getName());
        }
    }

    public static void catch_() {

    }
}
