/**
 * @Author:
 * @Date: 2024-08-07 18:33:36
 * @LastEditors: 
 * @LastEditTime: 2024-08-14 21:35:58
 * @FilePath: src/main/java/abstraction/bean/Car.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package abstraction.bean;

// 'Car' adında abstrakt bir sinif tanımlayır, bu sinifdən birbaşa obyekt yaratmaq mümkün deyil
public abstract class Car {

    // 'start' adında abstrakt bir metod tanımlayır, bu metodun icrasını törəməli siniflər təyin etməlidir
    public abstract void start();

    // 'stop' adında abstrakt bir metod tanımlayır, bu metodun icrasını törəməli siniflər təyin etməlidir
    public abstract void stop();

    // 'speedUp' adında abstrakt bir metod tanımlayır, bu metodun icrasını törəməli siniflər təyin etməlidir
    public abstract void speedUp();

    // 'startAndSpeedUp' adında konkret bir metod tanımlayır, bu metod abstrakt deyil və icra kodu burada verilir
    public void startAndSpeedUp(){
        start();  // 'start' metodunu çağırır, icrası törəməli siniflər tərəfindən təyin ediləcək
        speedUp();  // 'speedUp' metodunu çağırır, icrası törəməli siniflər tərəfindən təyin ediləcək
    }
}
