package StringPractice;

import java.util.Arrays;

public class SpiralProblem {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println("Original array: ");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }

        while (array.length != 0) {
            //printing first row
            for (int index = 0; index < array[0].length; index++) {
                System.out.print(array[0][index] + " ");
            }

            if (array.length == 1) {
                break;
            }

//            System.out.println("Array before removing row: ");
//            for (int[] row : array) {
//                System.out.println(Arrays.toString(row));
//            }

            int[][] newArray = new int[array.length - 1][array[0].length];
            for (int i = 1; i < array.length; i++) {
                System.arraycopy(array[i], 0, newArray[i - 1], 0, array[i].length);
            }

//            System.out.println("Array after removing row and before flipping: ");
//            for (int[] row : newArray) {
//                System.out.println(Arrays.toString(row));
//            }

            array = flipPotato(newArray);

//            System.out.println("Array after flipping");
//            for (int[] row : array) {
//                System.out.println(Arrays.toString(row));
//            }
        }
    }

    public static int[][] flipPotato(int[][] potato) {

        int flippedPotatoNumColumns = potato.length;
        int flippedPotatoNumRows = potato[0].length;

        int[][] flippedPotato = new int[flippedPotatoNumRows][flippedPotatoNumColumns];

        for (int columnIndex = potato[0].length - 1; columnIndex >= 0; columnIndex--) {
            int[] temp = new int[flippedPotatoNumColumns];
            for (int rowIndex = 0; rowIndex < flippedPotatoNumColumns; rowIndex++) {
                temp[rowIndex] = potato[rowIndex][columnIndex];
            }
            flippedPotato[potato[0].length - columnIndex - 1] = temp;
        }
        return flippedPotato;
    }
}
