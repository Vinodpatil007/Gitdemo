package Logical_programe;

public class example_pallindrome {
	public static void main(String[] args) {
		
	
	String str= "madam";
	
	String reverse ="" ;
	 
	
	
	for  (int i=str.length()-1; i>=0;i--)
		
	{reverse =reverse+str.charAt(i);}
	
	System.out.println(reverse);
	if (str.equals(reverse))
		{System.out.println("given string is pallindrome");}
	else {System.out.println("given string is not pallindrome");}
	
}
	
}		


