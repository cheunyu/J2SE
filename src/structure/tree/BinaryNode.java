package structure.tree;

import java.io.Serializable;

public class BinaryNode<T extends Comparable> implements Serializable {

    private static final long serialVersionUID = -6477238039299912313L;

    //左节点
    public BinaryNode<T> left;

    //右结点
    public BinaryNode<T> right;

    public T data;

    public BinaryNode(T data, BinaryNode left, BinaryNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(T data) {
        this.data = data;
    }

    /**
     * @description:判断是否为叶子节点
     * @param:[]
     * @return:boolean
     */
    public boolean isLeaf() {
        return this.left==null&&this.right==null;
    }
}
