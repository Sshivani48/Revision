import java.util.*;
public class duplicate {

  public static int removeDuplicates(int a[], int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    int[] temp = new int[n];
    int j = 0;
    for (int i = 0; i < n - 1; i++) {
      if (a[i] != a[i + 1]) {
        temp[j++] = a[i];
      }
    }
    
    if(Arrays.binarySearch(temp,a[n-1]) <0) {
        temp[j++] = a[n - 1];
    }
    
    for (int i = 0; i < j; i++) {
      a[i] = temp[i];
    }

    return j;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter the elements");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    n = removeDuplicates(a, n);
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
