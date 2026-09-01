import java.util.Scanner;
public class SelectionSort{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			int low=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[low]) {
					low=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[low];
			arr[low]=temp;
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
		
	}

}
