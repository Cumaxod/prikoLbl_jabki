package credit;

public class Na_zachet_2 {
    public static void main(String[] args){
        int day = 28;
        int month = 2;
        int year = 2020;

        if( month == 12 ){
            day = 1;
            month = 1;
            year = year + 1;
        } else if ((day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 ))){
            day = 1;
            month = month + 1;
        } else if ((day == 30 && (month == 4 || month == 6 || month == 9 || month == 11))) {
            month = month + 1;
            day = 1;
        } else if ((day == 28 && (month == 2 && (year % 4 == 0)))) {
            day = day +1;
        } else if (day == 28){
            month = month + 1;
            day = 1;
        }
        else{
            day = day + 1;
        }
        System.out.println("завтра будет " + day + " " + month + " " + year );
    }
}
