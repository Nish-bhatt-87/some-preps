import java.util.Arrays;

public class AnotherDeepOrShallowCopy {

    public static void main(String[] args) {
        IntegerNish[] x = new IntegerNish[]{new IntegerNish(7),new IntegerNish(66)};

        //IntegerNish[] x1 = Arrays.copyOf(x,x.length);
        IntegerNish[] x1 = deepCopy(x);

        x[0].setX(86);

        printArr(x);
        System.out.println();
        printArr(x1);


    }

    public static void printArr(IntegerNish[] x){
        System.out.println(x);
        for (int i =0; i<x.length; i++){
            System.out.print(x[i].getX() + " ");
        }
    }

    public static IntegerNish[] deepCopy(IntegerNish[] x) {
        IntegerNish[] newArr = Arrays.copyOf(x,x.length);

        for (int i =0; i<newArr.length; i++) {
            newArr[i] = new IntegerNish(x[i].getX());
        }

        return newArr;
    }
}
