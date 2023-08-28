import java.util.Scanner;
public class operations {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter size of arrays: ");
	  int sz = sc.nextInt();
	  int[][] arr1 = new int[sz][sz];
	  System.out.println("Enter elements of 1st array ");
	  for (int i = 0;i<arr1.length;i++) {
	    for (int j= 0;j<arr1.length;j++) {
	      arr1[i][j] = sc.nextInt();
	    }
	  } 
	  int[][] arr2 = new int[sz][sz];
	  System.out.println("Enter elements of 2nd array ");
	  for (int i = 0;i<arr2.length;i++) {
	    for (int j= 0;j<arr2.length;j++) {
	      arr2[i][j] = sc.nextInt();
	    }
	  } 
	  System.out.println("First array: ");
	  for (int i = 0;i<arr1.length;i++) {
	    for (int j= 0;j<arr1.length;j++) {
  	    System.out.print(arr1[i][j]+" ");
	    }
	    System.out.println();
	  }
	  System.out.println("Second array: ");
	  for (int i = 0;i<arr2.length;i++) {
	    for (int j= 0;j<arr2.length;j++) {
  	    System.out.print(arr2[i][j]+" ");
	    }
	    System.out.println();
	  }
	  System.out.println("Addition of two arrays");
	  for (int i = 0;i<sz;i++) {
	    for (int j= 0;j<sz;j++) {
  	    System.out.print(arr1[i][j]+arr2[i][j]+" ");
	    }
	    System.out.println();
	  }
	  System.out.println("Subtraction of two arrays");
	  for (int i = 0;i<sz;i++) {
	    for (int j = 0;j<sz;j++) {
  	    System.out.print((arr1[i][j]-arr2[i][j])+" ");
	    }
	    System.out.println();
	  }
	  System.out.println("Multiplication of two arrays");
	  for (int i = 0;i<sz;i++) {
	    for (int j = 0;j<sz;j++) {
  	    System.out.print((arr1[i][j]*arr2[i][j])+" ");
	    }
	    System.out.println();
	  }
	}
}
