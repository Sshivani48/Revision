
public class stringmethods {
	public static void main(String[] args) {
		String s1 = "WELCOME";
		String s2 = "welcome";
		System.out.println("Length method: "+s1.length());
		System.out.println("indexof method: "+s2.indexOf('m'));
		System.out.println("charat method: "+s1.charAt(5));
		System.out.println("equals method: "+s1.equals(s2));
		System.out.println("equalsignorecase method: "+s1.equalsIgnoreCase(s2));
		System.out.println("hashcode of 'WELCOME': "+s1.hashCode()+" hashcode of 'welcome': "+s2.hashCode());
		System.out.println("using ==: "+(s1==s2));
		System.out.println("'WELCOME' tolowercase method: "+s1.toLowerCase());
		System.out.println("'welcome' touppercase method: "+s2.toUpperCase());
		String s3 = " to reality";
		System.out.println("substring method: "+s3.substring(4));
		System.out.println("replace method: "+s2.replace("come", " racer"));
		System.out.println("repeat method: "+s1.repeat(2));
		String s4 = s2.concat(s3);
		System.out.println("concat method: "+s4);
		System.out.println("using isempty method: "+s2.isEmpty());
		String[] res = s4.split(" ");
		System.out.println("\nusing split method: ");
		for (String str : res) {
			System.out.println(str);
		}
		String jo= String.join(" * ", res);
		System.out.println("\nusing join *: "+jo);
		char[] charr = s4.toCharArray();
		System.out.println("using tochar array: ");
		for (char c : charr) {
			System.out.print(c+"\t");
		}
				
	}
}
