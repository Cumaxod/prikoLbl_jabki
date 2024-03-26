package credit;

public class Na_zachet_3 {
    public static void main(String[] args) {
        // int n = (int) (Math.random() * 28800);
        int n = 0;
        System.out.println("до конца рабочего дня в секундах: " + n); // для Петрова
        int hours = n / 3600;
        int minutes = (n - hours * 3600) / 60;
        int seconds = (n - hours * 3600) % 60;
        if (n == 0){
            System.out.println("рабочий день закончился");
        } else if (hours == 0) {
            System.out.println("Осталось менее часа,а именно:" + minutes + "мин. " + seconds + "сек.");
        } else if (hours > 0) {
            System.out.println("до конца рабочего дня: " + hours + "ч. " + minutes + "мин. " + seconds + "сек.");
        }
    }
}
