import java.util.*;
public class RemoveDuplicates{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int num:set){
            System.out.print(num+" ");
        }
        /*Arrays.sort(arr);
          int i= 0,j=0;
          while(i< n-1){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
            i++;
          }
          arr[j++] = arr[n-1];
          for(int k=0; k<j; k++){
              System.out.print(arr[k] + " ");
          }*/
    }
}