import java.util.Scanner;
public class sumavg
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of array");
	  int sz = sc.nextInt();
		int[] arr = new int[sz];
		int sum=0, avg;
		
		System.out.println("Enter the elements");
		for (int i=0;i<sz;i++) {
		   arr[i]=sc.nextInt();
		} 
		System.out.println("Sum of elements");
		for (int j=0;j<sz;j++) {
		    sum=sum+arr[j];
		} 
		System.out.println(sum);
		System.out.println("Average of elements");
		avg = sum/arr.length;
		System.out.println(avg);
	}
}
