import java.util.Arrays;

public class TwoDimensionalArrayTest {

    public static void main(String[] args) {
         IntegerNish[][] integerNishes= new IntegerNish[3][];

        integerNishes[0] = new IntegerNish[]{new IntegerNish(7)};
        integerNishes[1] = new IntegerNish[]{new IntegerNish(8), new IntegerNish(112)};
        integerNishes[2] = new IntegerNish[]{new IntegerNish(10),new IntegerNish(11), new IntegerNish(233)};

        IntegerNish[][] copiedArray = deepCopy(integerNishes);

        integerNishes[0][0].setX(99);
        copiedArray[1][1].setX(1087);

        // Print the original array
        System.out.println("Original array:");
        printArray(integerNishes);

        // Print the copied array
        System.out.println("Copied array:");
        printArray(copiedArray);

    }

    private static IntegerNish[][] deepCopy(IntegerNish[][] originalArray) {

        if (originalArray == null) return null;

        IntegerNish[][] newArray = new IntegerNish[originalArray.length][];

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != null) {
                newArray[i] = new IntegerNish[originalArray[i].length];

                for (int j = 0; j < originalArray[i].length; j++) {
                    int value = originalArray[i][j].getX();
                    newArray[i][j] = new IntegerNish(value);
                }
            }
        }

        return newArray;
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
