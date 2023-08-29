
public class stringbuildermethods {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.append("*"));
        System.out.println(sb.append("world!"));
        System.out.println(sb.insert(5, "beautiful "));
        System.out.println(sb.replace(12, 18, "amazing"));
        System.out.println(sb.delete(0, 7));
        System.out.println(sb.reverse());
        String result = sb.toString();
        System.out.println(result);
        System.out.println("Length : " + sb.length());
    }
}


