import java.util.Scanner;
public class gt2program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		int n = s.length();
		int temp=n;
		int rsz = 2;
		int csz = temp/2+1;
		char[][] c = new char[rsz][csz];
		int z =0;
		for (int j = 0; j < csz; j++) {
			for (int i = 0; i < rsz; i++) {
				if(z<n) {
					c[i][j]=s.charAt(z);
					z++;
				}
			}
		}	
		for (int i = 0; i < rsz; i++) {
			for (int j = 0; j < csz; j++) {
				System.out.print(c[i][j]);
			}
			System.out.print(" ");
		}	
	}
}
