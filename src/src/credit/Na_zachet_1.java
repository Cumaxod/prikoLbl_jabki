package credit;

public class Na_zachet_1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int r = 5;
        double c = (Math.sqrt(a*a + b*b)) / 2;
        if (r >= c) {
            System.out.println("закрывает");
        } else {
            System.out.println("не закрывает");
        }
    }
}
