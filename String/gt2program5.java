import java.util.Scanner;

public class gt2program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message: ");
		String str = sc.nextLine();
		String se = "";
		String so = "";
		for (int i = 0; i < str.length(); i++) {
			
			if(i%2 == 0) {
				se = se+str.charAt(i);
			} else {
				so = so+str.charAt(i);
			}
			
		}
		System.out.println(se+so);
	}

}
