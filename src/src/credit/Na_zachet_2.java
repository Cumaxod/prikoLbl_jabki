package credit;

public class Na_zachet_2 {
    public static void main(String[] args){
        int day = 15;
        int month = 3;
        int year = 2003;

        if( month == 12 ){
            day = 1;
            month = 1;
            year = year + 1;
        } else if ( day == 31 ){
            day = 1;
            month = month + 1;
        } else{
            day = day + 1;
        }
        System.out.println("завтра будет");
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }
}
