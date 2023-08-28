import java.util.Scanner;
class gt3challenge2
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int n = sc.nextInt();
    System.out.println("Enter the array elements ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int evencount=0;
    int oddcount=0;
    int count=0;
    int palincount=0;
    int primecount;
    int temp, rem, rev, num;
    for (int j = 0; j < arr.length; j++) {

      if(arr[j]%2==0) {
        evencount++;
      } else {
        oddcount++;
      }
      
      primecount=0;
      for (int k = 1; k <= arr[j]; k++) {
        if (arr[j]%k==0) {
          primecount++;
        }
      }
      if (primecount==2) {
          count++;
      }
      
      rev=0;
      temp=arr[j];
        num=arr[j];
      if(arr[j]>99) {
      
        while (num>0) {
          rem=num%10;
          rev=rem+rev*10;
          num/=10;
        }
      }
      if (temp==rev) {
        palincount++;
      }
      
          
    }
    System.out.println("Number of even elements: "+evencount);
    System.out.println("Number of odd elements: "+oddcount);
    System.out.println("Number of prime elements: "+count);
    System.out.println("Number of palindrome elements: "+palincount);
    
  }
}