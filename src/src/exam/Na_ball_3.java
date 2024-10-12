package exam;

import java.util.Random;
import java.util.Scanner;

public class Na_ball_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int n = scan.nextInt();
        Random rand = new Random();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }else if(i == arr.length - j - 1) {
                    arr[i][j] = 0;
                }else if (i < j ) {
                    arr[i][j] = rand.nextInt(5) + 1;
                }else if (i > j  ){
                    arr[i][j] = rand.nextInt(5) * -1 - 1;
                }
            }

        }
        System.out.println("массив");
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("%3d ", arr[i][j]); // было наглым образом найденно в инете
            }
            System.out.println();
        }
    }


}

