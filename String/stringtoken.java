import java.util.StringTokenizer;

public class stringtoken {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Welcome to java world"," ");
		System.out.println("Gives some unknown output: \t"+s);
		System.out.println("number of tokens: "+s.countTokens());
		while (s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
	}
}
