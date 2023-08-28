import java.util.Scanner;
public class arrayusingScanner
{
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter size of 1-D array");
	  int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for (int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		} 
		System.out.println("Accessing using for each");
		for (int s : arr) {
		    System.out.println(s);
		} 
		
	  System.out.println("Enter size of 2-D array");
	  int sz = sc.nextInt();
		int[][] a = new int[sz][sz];
		
		System.out.println("Enter the elements");
		for (int i=0;i<a.length;i++) {
		    for (int j=0;j< a.length;j++) {
		        a[i][j]=sc.nextInt();
		    }
		} 
		System.out.println("Accessing using nested for loop");
		for (int i=0;i<a.length;i++) {
		    for (int j=0;j< a.length;j++) {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		} 
    
	}
}
