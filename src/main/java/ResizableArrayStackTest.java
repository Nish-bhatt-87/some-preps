public class ResizableArrayStackTest {

    public static void main(String[] args) {
        ResizableArrayStack<Integer> stack = new ResizableArrayStack<>();

        // Push elements onto the stack
        stack.push(1);

        stack.push(2);
        stack.push(3);
        System.out.println(stack.getCapacity());

        stack.push(4);

        stack.push(5);
        stack.push(6);
        System.out.println(stack.getCapacity());
        stack.push(7);

        stack.push(8);
        stack.push(9);
        System.out.println(stack.getCapacity());
        stack.push(10);
        System.out.println(stack.getCapacity());
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        stack.push(16);
        stack.push(17);

        System.out.println(stack.getCapacity());
        // Print and pop elements
        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
            System.out.println(stack.getCapacity());
        }
    }
}
