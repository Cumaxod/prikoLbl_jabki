package exam;

public class Na_ball_1 {
    public static void main(String[] args){
        int time = 2_258_521;
        int weeks = time / 604_800;
        int days = (time - (weeks * 604_800)) / 86_400;
        int hours = (time - ((weeks * 604_800)+(days * 86_400))) / 3600;
        int minutes = (time -((weeks * 604_800)+(days * 86_400)+(hours * 3600))) / 60;
        int seconds = (time -((weeks * 604_800)+(days * 86_400)+(hours * 3600)+(minutes * 60)));
        //недели
        if (weeks > 1){
            System.out.println(weeks);
            System.out.println("недели");
        } else if(weeks == 1){
            System.out.println(weeks);
            System.out.println("неделя");
        }
        //дни
        if (days > 4){
            System.out.println(days);
            System.out.println("дней");
        } else if(days > 1 && days <= 4){
            System.out.println(weeks);
            System.out.println("дня");
        } else if(days == 1){
            System.out.println(days);
            System.out.println("день");
        }
        //часы
        if (hours == 1 ||  hours == 21){
            System.out.println(hours);
            System.out.println("час");
        } else if( hours == 2 || hours == 3 || hours == 4 || hours == 22 || hours == 23 || hours == 24 ){
            System.out.println(hours);
            System.out.println("часа");
        } else if(hours >= 5 && hours <= 20){
            System.out.println(hours);
            System.out.println("часов");
        }
        //минуты
        if (minutes == 2 ||  minutes == 3 || minutes == 4 ||minutes == 22 ||  minutes == 23 || minutes == 24
                || minutes == 32 ||  minutes == 33 || minutes == 34 ||minutes == 42 ||  minutes == 43 || minutes == 44 ||
                minutes == 52 ||  minutes == 53 || minutes == 54 ){
            System.out.println(minutes);
            System.out.println("минуты");
        } else if( minutes == 1 || minutes == 21 || minutes == 31 || minutes == 41 || minutes == 51 ){
            System.out.println(minutes);
            System.out.println("минута");
        } else if( minutes >= 5 && minutes <= 60) {
            System.out.println(minutes);
            System.out.println("минут");
        }
        //секунды
        if (seconds == 2 || seconds == 3 || seconds == 4 || seconds == 22 || seconds == 23 || seconds == 24
                || seconds == 32 || seconds == 33 || seconds == 34 || seconds == 42 || seconds == 43 || seconds == 44 ||
                seconds == 52 || seconds == 53 || seconds == 54 ){
            System.out.println(seconds);
            System.out.println("секунды");
        } else if( seconds == 1 || seconds == 21 || seconds == 31 || seconds == 41 || seconds == 51 ){
            System.out.println(seconds);
            System.out.println("секунда");
        } else if( seconds >= 5 && seconds <= 60) {
            System.out.println(seconds);
            System.out.println("секунд");
        }
    }
}
