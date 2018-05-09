package collection.List;


import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("a");
        stack.add("b");
        stack.add("c");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println("------------------------------");
        //查看堆栈顶部的对象，但不从堆栈中移除它
        String sPeek = stack.peek();
        System.out.println(sPeek);
        System.out.println("------------------------------");
        //把项压入堆栈顶部
        stack.push("d");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println("------------------------------");
        //移除堆栈顶部的对象，并作为此函数的值返回该对象
        String sPop = stack.pop();
        System.out.println(sPop);
        System.out.println("------------------------------");
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
