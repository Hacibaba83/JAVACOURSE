/**
 * @Author:
 * @Date: 2024-08-17 12:20:31
 * @LastEditors: 
 * @LastEditTime: 2024-08-17 14:54:21
 * @FilePath: src/main/java/annotation/Test.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher();
     
        t.method(19);
        
//        Student[] ss = {new Student()};
//        t.setStudent(ss);
//        
//        checkObjNotNull(t);
    }

    public static void checkObjNotNull(Object obj) throws Exception {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {

            Method m = methods[i];

            Annotation[] anns = m.getAnnotations();

            System.out.println(methods[i].getName());

            for (int j = 0; j < anns.length; j++) {
                Annotation ann = anns[j];
                if (ann.annotationType() == BoshOlmasin.class) {
                    Object result = m.invoke(obj);
                    if (result == null) {
                        throw new IllegalArgumentException("Dedim axi bosh olmasin...");
                    }
                    if (result instanceof Object[]) {
                        Object[] arr = (Object[]) result;
                        if (arr.length == 0) {
                            throw new IllegalArgumentException("Dedim axi bosh olmasin arr...");
                        }
                    }

                }
                System.out.println("ann=" + ann.annotationType());
            }
            System.out.println("-------------------------");
        }
    }
}
