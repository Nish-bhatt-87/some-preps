import java.util.Arrays;

public class ResizableArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] array;
    private int size;

    public ResizableArrayStack() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public int  getCapacity() {
      return this.array.length;
    }

    public void push(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        System.out.println("current size is " + size);
        //System.out.println(--size);
        T element = (T) array[--size];
        array[size] = null; // Set the reference to null for garbage collection
        shrinkIfNeeded();
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return (T) array[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, 2 * size); // Double the size of the array
        }
    }

    private void shrinkIfNeeded() {
        if (size > 0 && size == array.length / 4) {
            array = Arrays.copyOf(array, array.length / 2); // Halve the size of the array
        }
    }


}