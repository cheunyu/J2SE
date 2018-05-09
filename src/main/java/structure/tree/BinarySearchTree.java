package structure.tree;

import java.util.Comparator;

/**
 * @author:cheunyu
 * @date:2018/4/11 23:05
 */
public class BinarySearchTree<T extends Comparable> implements Tree<T>{

    //根节点
    protected BinaryNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    /**
     * @description:插入操作，递归实现
     * @param:[data, p]
     * @return:structure.tree.BinaryNode<T>
     */
    private BinaryNode<T> insert(T data, BinaryNode<T> p) {
        if(p == null) {
            p = new BinaryNode<>(data, null, null);
        }
        //比较插入结点的值，决定向左子树还是右子树搜索
        int compareResult = data.compareTo(p.data);
        if (compareResult < 0) {    //左
            p.left = insert(data, p.left);
        }else if(compareResult > 0) {   //右
            p.right = insert(data, p.right);
        }
        return p;
    }

    private BinaryNode<T> remove(T data, BinaryNode<T> p) {
        if (p == null) {
            return p;
        }
        int compareResult = data.compareTo(p.data);
        if (compareResult < 0) {
            p.left = remove(data, p.left);
        }else if (compareResult > 0) {
            p.right = remove(data, p.right);
        }else if (p.left != null && p.right != null) {
//            p.data = findMin(p.right).data;
            p.right = remove(data, p.right);
        }else {
            p = (p.left != null) ? p.left : p.right;
        }
        return p;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int siez() {
        return 0;
    }

    @Override
    public int height() {
        return 0;
    }

    @Override
    public String preOrder() {
        return null;
    }

    @Override
    public String inOrder() {
        return null;
    }

    @Override
    public String postOrder() {
        return null;
    }

    @Override
    public String levelOrder() {
        return null;
    }

    @Override
    public void insert(T data) {
        if (data == null) {
            throw new RuntimeException("data can\'Comparable be null");
        }
        root = insert(data, root);
    }

    @Override
    public void remove(T data) {
        if (data == null)
            throw new RuntimeException("data can\'Comparable be null !");
        root = remove(data, root);
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public T finMax() {
        return null;
    }

    @Override
    public BinaryNode findNode(T data) {
        return null;
    }

    @Override
    public boolean contains(T data) throws Exception {
        return false;
    }

    @Override
    public void clear() {

    }
}
