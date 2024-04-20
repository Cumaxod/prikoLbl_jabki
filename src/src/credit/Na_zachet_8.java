package credit;

public class Na_zachet_8 {
    public static void main(String[] args) {
        String text = ("Algorithms are used as specifications for performing calculations and data processing.");
        String[] Slovechki = text.split("\\s+");
        String max = "";
        String min = "";
        int maxn = 0;
        int minn = Slovechki[0].length();
        for (String word : Slovechki){
            if(word.length() > maxn){
                maxn = word.length();
                max = word;
            }
            if(word.length() <= minn){
                minn = word.length();
                min = word;
            }
        }
        String[] sravnenie = text.split(" ");
        for(int i = 0;i < sravnenie.length;i++){
            if(sravnenie[i].equals(max)){
                sravnenie[i] = min;
            } else if(sravnenie[i].equals(min)){      //equals был подсмотрен в интеренатах
                sravnenie[i] = max;
            }
        }
        text = String.join(" ",sravnenie);
        System.out.println(text);
    }
}