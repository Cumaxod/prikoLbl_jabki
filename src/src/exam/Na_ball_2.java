package exam;

import java.util.Scanner;

public class Na_ball_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("подымается за день на: ");
        int podimae = scan.nextInt();
        System.out.println("спускается за ночь на: ");
        int spuscae = scan.nextInt();
        System.out.println("дерево в высоту: ");
        int derevo = scan.nextInt();
        int days = 0;
        if(podimae > derevo){
            System.out.println("за денёк залезет");
        }
        else if(podimae > spuscae){
            do{
                days++;
                derevo = derevo -(podimae - spuscae);

            }while(derevo > spuscae);
            System.out.println("подымется за " + days + " суток ");

//            int n = derevo/(podimae-spuscae);
//            System.out.println("подымется за " + n + " суток ");
        }
    }
}
