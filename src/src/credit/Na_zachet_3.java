package credit;

public class Na_zachet_3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28800);
        System.out.println("до конца рабочего дня в секундах:"); // для Петрова
        System.out.println(n);
        int hours = n / 3600;
        System.out.println(hours);
        if (hours == 0){
            System.out.println("Остался завершающий час работы");
        }else{
            System.out.println("до конца рабочего дня осталось столько часов");
            System.out.println(hours);
        }

    }
}
