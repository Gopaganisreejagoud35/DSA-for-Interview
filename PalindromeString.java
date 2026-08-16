import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        /*for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);

        }
        System.out.println(str.equals(rev)?"Palindrome":"Not Palindrome");*/
        int i=0;
        int j=str.length()-1;
        while(i<str.length()/2 && j>=str.length()/2){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome");
                return;
            }
            i++;j--;
        }
        System.out.println("Palindrome");
    }

}
