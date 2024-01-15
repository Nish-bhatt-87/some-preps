public class CloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        IntegerNish[] x = new IntegerNish[3];

        x[0] = new IntegerNish(3);
        x[1] = new IntegerNish(4);
        x[2] = new IntegerNish(88);

        IntegerNish[] clone = x.clone();
        clone[0] = (IntegerNish)x[0].clone(); //coment this out
        clone[1] = (IntegerNish)x[1].clone(); //comment this out
        clone[2] = (IntegerNish)x[2].clone(); //comment this out

        x[1].setX(78);

        printArr(clone);
        printArr(x);
    }


    public static void printArr(IntegerNish[] integerNishes) {
        for (int i =0; i<integerNishes.length; i++) {
            System.out.println(integerNishes[i].getX());
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
