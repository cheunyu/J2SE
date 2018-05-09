package structure.tree;

public interface Tree<T extends Comparable>{

    /**
     * @description:判空
     * @param:[]
     * @return:boolean
     */
    boolean isEmpty();
    
    /**
     * @description:二叉树的结点个数
     * @param:[]
     * @return:int
     */
    int siez();
    
    /**
     * @description:返回二叉树的高度或者深度，即结点的最大层次
     * @param:[]
     * @return:int
     */
    int height();
    
    /**
     * @description:先根次序遍历
     * @param:[]
     * @return:java.lang.String
     */
    String preOrder();
    
    /**
     * @description:中根次序遍历
     * @param:[]
     * @return:java.lang.String
     */
    String inOrder();

    /**
     * @description:后根次序遍历
     * @param:[]
     * @return:java.lang.String
     */
    String postOrder();

    /**
     * @description:层次遍历
     * @param:[]
     * @return:java.lang.String
     */
    String levelOrder();

    /**
     * @description:将data插入
     * @param:[data]
     * @return:void
     */
    void insert(T data);

    /**
     * @description:删除
     * @param:[data]
     * @return:void
     */
    void remove(T data);

    /**
     * @description:查找最小值
     * @param:[]
     * @return:T
     */
    T findMin();

    /**
     * @description:查找最大值
     * @param:[]
     * @return:T
     */
    T finMax();

    /**
     * @description:根基值找到结点
     * @param:[data]
     * @return:BinaryNode
     */
    BinaryNode findNode(T data);
    
    /**
     * @description:是否包含某个值
     * @param:[data]
     * @return:boolean
     */
    boolean contains(T data) throws Exception;

    /**
     * @description:清空
     * @param:[]
     * @return:void
     */
    void clear();
}
