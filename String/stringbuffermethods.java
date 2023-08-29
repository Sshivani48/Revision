public class stringbuffermethods {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("java buffer");
	    System.out.println("Length : " + str.length());
	    System.out.println("Capacity : " + str.capacity());
	    System.out.println(str.append(" methods"));
	    System.out.println(str.insert(5, "string "));
	    System.out.println("Reversed String: " + str.reverse());
	    System.out.println(str.reverse());
	    System.out.println(str.lastIndexOf("r"));
	    System.out.println("Resulting String after replacing: " + str.replace(5, 18, " *-* "));
	    System.out.println("Resulting String after deleting sequence of characters: " + str.delete(5, 11));    
	}
}
