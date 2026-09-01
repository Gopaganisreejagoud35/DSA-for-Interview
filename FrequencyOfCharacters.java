import java.util.Scanner;
import java.util.HashMap;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> Map=new HashMap<>();
        for(char ch:str.toCharArray()){
            Map.put(ch,Map.getOrDefault(ch,0)+1);
        }
        System.out.println(Map);
    }
}
