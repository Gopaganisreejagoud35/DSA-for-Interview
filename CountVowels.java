import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine().toLowerCase();
      String vowels="aeiou";
      int count=0;
      for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(vowels.indexOf(ch)!=-1){
            count++;
        }
      }
        System.out.println("Number of vowels: "+count);


    }
}
