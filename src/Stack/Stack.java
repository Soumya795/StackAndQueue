package Stack;
class MyNode {
    int key;
    MyNode next;
}
public class Stack {
    private MyNode top;

    /*
     * This method is used to add elements to stack
     * @param element: elements to be added.
     */
    public void push(int element) {
        MyNode node = new MyNode();
        node.key = element;
        node.next = top;
        top = node;
    }
    /* This method is used to display the stack list */
    public void display() {
        MyNode tempNode = top;
        if (top == null)
            System.out.println("Stack empty");
        else {
            System.out.println("Stack List is -");
            while (tempNode != null) {
                System.out.println(tempNode.key);
                tempNode = tempNode.next;
            }
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();

    }
}

