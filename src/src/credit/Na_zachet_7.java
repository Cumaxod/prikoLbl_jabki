package credit;

import java.util.Random;

public class Na_zachet_7 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for(int i = 0;i < arr.length;i++){
            arr[i] = new Random().nextInt(50);
            System.out.print(arr[i] + " ");  // я не понял что значить распечатать,пока это и есть рапспечатка
        }
        for(int j = 0;j < arr.length / 2;j++){
          int n = arr[j];
          arr[j] = arr[arr.length - j - 1];
          arr[arr.length - j - 1] = n;
        }
        System.out.println("перевёрнутый массив:");
        for(int h = 0;h < arr.length;h++){
            System.out.print(arr[h] + " ");
        }
    }
}
