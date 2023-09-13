package programstrings;

public class Equals {

	public static void main(String[] args) {
		String S="java";
		String S1="JAVA";
		String S2="Java";
		String S3="java";
		System.out.println(S.equals(S1));
		System.out.println(S1.equals(S2));
		System.out.println(S2.equals(S3));
		System.out.println(S3.equals(S));
	}

}
