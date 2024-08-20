/**
 * @Author:
 * @Date: 2024-08-08 19:53:53
 * @LastEditors: 
 * @LastEditTime: 2024-08-08 21:52:00
 * @FilePath: src/main/java/pattern/builder_pattern/Fanar.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package pattern.builder_pattern;

import pattern.builder_pattern.Fanar.Fanar_Builder;
import pattern.mutable_immutable.Mercedec;

public class Fanar {

    private String name = null;
    private Mercedec m = null;

    private Fanar() {

    }

    private Fanar(String name, Mercedec m) {
        this.name = name;
        this.m = m;
    }

    public String getName() {
        return name;
    }


    public Mercedec getM() {
        return m;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setM(Mercedec m) {
        this.m = m;
    }

    public static Fanar_Builder builder() {
        Fanar_Builder ff = new Fanar_Builder();
        return ff;

    }

    public static class Fanar_Builder {


        private Fanar f = null;

        public Fanar_Builder() {
            f = new Fanar();
        }

        public Fanar build() {
            return new Fanar(f.name, f.m);
        }

        public Fanar_Builder setName(String name) {
            this.f.setName(name);
            return this;
        }

        public Fanar_Builder setM(Mercedec m) {
            this.f.setM(m);
            return this;
        }
    }
}
