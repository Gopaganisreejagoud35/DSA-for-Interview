import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int firstLargest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int j=0;j<n;j++){
        if(arr[j]>firstLargest){
            secondLargest=firstLargest;
            firstLargest=arr[j];
        }
        else if(arr[j]>secondLargest && arr[j]<=firstLargest){
            secondLargest=arr[j];
        }
    }
    System.out.println(secondLargest);
    }
}
