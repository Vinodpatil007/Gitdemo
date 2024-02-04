package Logical_programe;

public class find_white_spaces_in_string {
	public static void main(String[] args) {
		String str ="  a b  c  d   ";
		int count=0;
		
		for (int i=0;i<=str.length()-1; i++)
		{char a=str.charAt(i);
		if (a ==' ')
			count++; }
		
		System.out.println(count);	
	
	}
	
}
