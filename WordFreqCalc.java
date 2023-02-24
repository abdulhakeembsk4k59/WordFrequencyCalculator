import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFreqCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String words[] = text.split(" ");

        HashMap<String,Integer> frequency = new HashMap<>();
        for(String word: words){
            if(frequency.containsKey(word)){
                frequency.put(word, frequency.get(word)+1);
            }else{
                frequency.put(word,1);
            }
        }
        for(Map.Entry<String,Integer>entry:frequency.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
