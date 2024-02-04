package Logical_programe;

public class Reverse_middle_string { 
	public static String main(String[] args) {
		String str="abc xyz abc1 xyz1";
		String  [] ar = str.split(" ");
		for (int i=0;i<=ar.length-1; i++)
		{if( i==0    ||   i==10)
			if( i%2==0)
			{String s1= ar[i];
	
		ar[i]=reversestring String (s1);
		
		}    
		}
	}
	public static String String  (String inp) {
		String rev =" ";
		for (int i= inp.length()-1 ;i>=0; i--)
		{rev = rev +inp.charAt(i);
		}return rev ;
		}
	
	
	}