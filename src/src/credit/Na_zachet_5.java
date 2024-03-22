package credit;

import java.util.Scanner;

public class Na_zachet_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scan.nextInt();

        if (n > 3) {
            boolean boo = true;
            for (int c = 2; c <= n / 2; c++) {
                if (n % c == 0) {
                    boo = false;
                    break;
                }
            }
            if (boo) {
                System.out.println("число " + n + " простое");
            } else {
                System.out.println("число " + n + " не простое");
            }
        } else {
            System.out.println("число " + n + " простое");
        }
    }
}
