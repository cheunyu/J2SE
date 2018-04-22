package io.object;

import java.io.Serializable;

/**
 * @author:cheunyu
 * @date:2018/4/23 2:17
 * @deprecated 要序列化操作的类，实现Serializable接口，使用transient关键字设置属性不做序列化
 */
public class C implements Serializable {

    private String name;
    private transient String color;

    public C(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
