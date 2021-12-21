import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //4.1

        System.out.println("Task#1");
        double[] numbers1 = new double[] { 1, 1, 1, 2, 1, 1 };
        double[] numbers2 = new double[] { 0, 0, 0, 0.55, 0, 0 };

        System.out.println("Unique number for first arrays is: " + findUniqueNumber(numbers1));
        System.out.println("Unique number for second arrays is: " + findUniqueNumber(numbers2));


        //4.2
        System.out.println("\nTask#2");
        int[] unsortedArray = new int[] { 5, 3, 2, 8, 1, 4 };

        System.out.println("Sorting array, but only odd numbers");
        System.out.print("[ ");

        for (int num :
                unsortedArray) {
            System.out.print(num + ", ");
        }

        System.out.print("] -> [ ");

        int[] oddSortedArray = sortOdd(unsortedArray);

        for (int num : oddSortedArray) {
            System.out.print(num + ", ");
        }

        System.out.print("]");
    }

    public static int[] sortOdd(int[] array){
        ArrayList<Integer> oddNumbers = new ArrayList();

        for (int number : array) {
            if (number % 2 == 1){
                oddNumbers.add(number);
            }
        }

        Collections.sort(oddNumbers);

        for (int i = 0, j = 0; i < oddNumbers.size(); i++, j++){
            while (array[j] % 2 == 0){
                j++;
            }
            array[j] = oddNumbers.get(i);
        }
        return array;
    }
    public static double findUniqueNumber(double[] array){
        Arrays.sort(array);
        return array[0] == array[1] ? array[array.length-1] : array[0];
    }
}
