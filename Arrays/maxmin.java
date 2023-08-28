import java.util.Scanner;
public class maxmin {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
	  int sz = sc.nextInt();
		int[] a = new int[sz];
		int max, min;
		
		System.out.println("Enter the elements");
		for (int i=0;i<sz;i++) {
		   a[i]=sc.nextInt();
		} 
		max=a[0];
		System.out.println("Maximum of elements");
		for (int i=1;i<sz;i++) {
		  if (a[i]>max) 
	      max=a[i];
		}
		System.out.println(max);
		min=a[0];
		System.out.println("Minimum of elements");
		for (int i=1;i<sz;i++) {
		  if (a[i]<min) 
	      min=a[i];
		}
		System.out.println(min);
	}
}

