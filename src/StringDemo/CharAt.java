package StringDemo;

public class CharAt {
	public static void main(String[] args) {
		String s="Welcome to Testing Shastra";
		int count=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)=='e')
				count++;
		}
		System.out.println("Frequency of e :"+count);
	}
	 
}

		/*int strlength=s.length();
		System.out.println("Character at 0th index is:"+s.charAt(0));
		System.out.println("Character at last index is :"+s.charAt(strlength-1));
	}*/
	
	

  
		

  
