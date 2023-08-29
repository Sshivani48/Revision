import java.util.Scanner;

public class gt2program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[noun] was really [adjective] today. We learned how to write [activity] today. I can't wait for tomorrow!\nEnter the missing words: ");
		System.out.println("A noun: ");
		String noun = sc.nextLine();
		System.out.println("An adjective: ");
		String adj = sc.nextLine();
		System.out.println("An activity: ");
		String act = sc.nextLine();
		System.out.println(noun+" was really "+adj+" today. We learned how to write java "+act+" today. I can't wait for tomorrow!");
	}

}
