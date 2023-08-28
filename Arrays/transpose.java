import java.util.Scanner;
public class transpose {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Size");
	    int sz=sc.nextInt();
  		int[][] a= new int[sz][sz];
  		int[][] b=new int[sz][sz];
  		System.out.println("Enter array elements");
	    for (int i=0;i<a.length;i++) {
        for (int j=0;j<a.length;j++) {
          a[i][j]=sc.nextInt();   
        }
	    }
	    System.out.println("The array elements are");
	    for (int i=0;i<a.length;i++) {
        for (int j=0;j<a.length;j++) {
          System.out.print(a[i][j]+" ");
        } 
        System.out.println();
	    }
	    
	    System.out.println("The transpose of array elements are");
	    for (int i=0;i<a.length;i++) {
        for (int j=0;j<a.length;j++) {
          b[i][j]=a[j][i];
          System.out.print(b[i][j]+" ");
        } 
        System.out.println();
	    } 
    }
}
