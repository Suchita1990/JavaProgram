package StringDemo;

public class Concate {
	public static void main(String[] args) {
		String s1="Java";
		String s2="tpoint";
		String s3="Reader";
		String str4=s1.concat(s2).concat("").concat(s3);
		System.out.println(str4);
		String str5=s1.concat(s2).concat("!!!");
		System.out.println(str5);
	}

}
