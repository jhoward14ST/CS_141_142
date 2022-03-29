package testing;

import utility.MyQueue;
import java.util.Stack;
import utility.MyStack;

public class MyStackTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t S T A C K    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void libraryVersionTest(){
        System.out.println();
        System.out.println("------------ L I B R A R Y   S T A C K  --------------");
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();

        //test push
        System.out.println("************Test push**************");
        System.out.println(stack.push("Red"));
        System.out.println(stack.push("Orange"));
        System.out.println(stack.push("Yellow"));
        System.out.println(stack.push("Green"));
        System.out.println(stack.push("Blue"));
        System.out.println(stack.push("Indigo"));
        System.out.println(stack.push("Violet"));
        System.out.println(stack);
        System.out.println();


        // test pop
        System.out.println("************Test pop**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------1st pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------2nd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------3rd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------4th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------5th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------6th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println("----------7th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);

        //test peek
        System.out.println("************Test peek**************");
        stack1.push("Red");
        stack1.push("Orange");
        stack1.push("Yellow");
        System.out.println(stack1);
        System.out.println("peek element: " + stack1.peek());
        System.out.println();
    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println("------------ M Y   S T A C K --------------");
        MyStack<String> stack = new MyStack<>();
        MyStack<String> stack1 = new MyStack<>();

        //test push
        System.out.println("************Test push**************");
        System.out.println(stack.push("Red"));
        System.out.println(stack.push("Orange"));
        System.out.println(stack.push("Yellow"));
        System.out.println(stack.push("Green"));
        System.out.println(stack.push("Blue"));
        System.out.println(stack.push("Indigo"));
        System.out.println(stack.push("Violet"));
        System.out.println(stack);
        System.out.println();
        System.out.println("================add before and after===========");
        System.out.print(" Before");
        System.out.print(stack);
        System.out.println(" After");

        // test pop
        System.out.println("************Test pop**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------1st pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------2nd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------3rd pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------4th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------5th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------6th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();
        System.out.println("----------7th pop-----------");
        System.out.println("Pop element: "  + stack.pop());
        System.out.println("isEmpty? "      + stack.isEmpty());
        System.out.println("size: "         + stack.size());
        System.out.println(stack);
        System.out.println();

        //test peek
        System.out.println("************Test peek**************");
        stack1.push("Red");
        stack1.push("Orange");
        stack1.push("Yellow");
        System.out.println(stack1);
        System.out.println("peek element: " + stack1.peek());
        System.out.println();

        // test stackToQueue
        System.out.println("---------------TEST MY VERSION STACK TO QUEUE------------");
        MyStack<Integer> stack3 = new MyStack<>();
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println(stack3.push(1));
        System.out.println(stack3.push(2));
        System.out.println(stack3.push(3));
        System.out.println(stack3.push(4));
        System.out.println(stack3.push(5));
        System.out.println(stack3.push(6));
        System.out.println(stack3.push(7));
        System.out.println("Stack: " + stack3);
        stackToQueue(stack3, queue);
        System.out.println("Queue: " +queue);

        System.out.println("---------------TEST MY VERSION QUEUE TO STACK------------");
        MyStack<Integer> stack4 = new MyStack<>();
        MyQueue<Integer> queue1 = new MyQueue<>();
        System.out.println(queue1.add(1));
        System.out.println(queue1.add(2));
        System.out.println(queue1.add(3));
        System.out.println(queue1.add(4));
        System.out.println(queue1.add(5));
        System.out.println(queue1.add(6));
        System.out.println(queue1.add(7));
        System.out.println("Queue: " + queue1);
        queueToStack(queue1, stack4);
        System.out.println("Stack: " + stack4);
    }

    public static int removeMin(MyStack<Integer> stack){
        MyQueue<Integer> queue = new MyQueue<>();
        int min = stack.pop();
        queue.add(min);

        while(!stack.isEmpty()) {
            int next = stack.pop();
            if(next < min) {
                min = next;
            }
            queue.add(next);
        }

        while(!queue.isEmpty()) {
            int next = queue.remove();
            if(next !=min) {
                stack.push(next);
            }
        }

        stackToQueue(stack, queue);
        queueToStack(queue, stack);

        return min;
    }

    public static void removeMinTest(){
        System.out.println();
        System.out.println("------------ R E M O V E   M I N --------------");
    }

    public static void removeMinTest2(){
        System.out.println();
        System.out.println("------------ R E M O V E   M I N    T E S T--------------");
        MyStack<Integer> stack = new MyStack<>();
        stack.push(2);
        stack.push(8);
        stack.push(3);
        stack.push(11);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(7);
        stack.push(12);
        stack.push(4);
        System.out.println("Original stack: " + stack);
        System.out.println();
        System.out.println("Min value: " + removeMin(stack));
        System.out.println("New stack: " + stack);
    }

    public static void queueToStack(MyQueue<Integer> queue, MyStack<Integer> stack) {
        while(!queue.isEmpty()) {
            int item = queue.remove();
            stack.push(item);
        }
    }

    public static void stackToQueue(MyStack<Integer> stack, MyQueue<Integer> queue){
        while(!stack.isEmpty()) {
            int item = stack.pop();
            queue.add(item);
        }
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
        removeMinTest();
        removeMinTest2();
    }
}

