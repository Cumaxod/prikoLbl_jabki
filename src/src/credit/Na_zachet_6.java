package credit;

import java.util.Arrays;
import java.util.Random;

public class Na_zachet_6 {
    public static void main(String[] args) {
        int[] arr = {4,7,2};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int min = arr[0];
        int minIndex = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
                minIndex = j;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Индекс минимального элемента: " + minIndex);

    }
}
