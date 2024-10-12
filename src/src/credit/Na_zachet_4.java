package credit;

public class Na_zachet_4 {
    public static void main(String[] args) {
        int c = 0;
        for(int i = 0; i < 100000; i++){
            if ((i < 100 && i % 10 == 4) || (i / 40 == 1 && i < 50) || (i == 13)){
                c++;
            } else if ((i < 1000 && i > 100 && i % 10 == 4) || (i % 100 / 10 == 4) || (i % 100 == 13) || (i / 10 == 13)) {
                c++;
            }
        }
        System.out.println("Количество исключенных номеров: " + c);
    }
}

// if (i < 100 && i % 10 == 4 || i / 40 == 1 && i < 50 || i == 13){
//c++;
//        }