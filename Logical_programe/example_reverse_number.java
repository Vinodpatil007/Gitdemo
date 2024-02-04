+package Logical_programe;

public class example_reverse_number {
	public static void main(String[] args) {
		int num =112233; 
		String str  =Integer.toString(num);
		
		String rev= "";
		for (int i=str.length()-1; i>=0; i--)
		{rev= rev+str.charAt(i);}
			int reverse =Integer.parseInt(rev);
			System.out.println(reverse);
	}

}
