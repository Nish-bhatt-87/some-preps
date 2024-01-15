public class Main {

    public static void main(String[] args) {
        //recursionWithStackOverflow();
        recursionWithoutStackOverflow(8);
    }

    private static void recursionWithoutStackOverflow(int count) {
        if (count ==0) {
            System.out.println("done");
        }else {
            System.out.println("hi");
            recursionWithoutStackOverflow(count -1);
        }
    }

    public static void recursionWithStackOverflow() {
        System.out.println("hi");
        recursionWithStackOverflow();
    }
}
