import java.util.Arrays;

public class TwoDimensionalArrayTestShallowCopy {

    public static void main(String[] args) {
        IntegerNish[][] integerNishes= new IntegerNish[3][];

        integerNishes[0] = new IntegerNish[]{new IntegerNish(7)};
        integerNishes[1] = new IntegerNish[]{new IntegerNish(8), new IntegerNish(112)};
        integerNishes[2] = new IntegerNish[]{new IntegerNish(10),new IntegerNish(11), new IntegerNish(233)};

        IntegerNish[][] shallowCopyArray = integerNishes.clone();

        for (int i =0; i< shallowCopyArray.length; i++) {
            shallowCopyArray[i] = Arrays.copyOf(integerNishes[i],integerNishes[i].length);
        }

        for (int i =0 ; i<shallowCopyArray.length; i++) {
            System.out.println(shallowCopyArray[i]);
            System.out.println(integerNishes[i]);
        }

        integerNishes[0][0].setX(18698);

        // Print the original array
        System.out.println("Original array:");
        printArray(integerNishes);

        // Print the shallow copy array
        System.out.println("Shallow copy array:");
        printArray(shallowCopyArray);


    }

    private static void printArray(IntegerNish[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j].getX() + " ");
            }
            System.out.println();
        }
    }

}
