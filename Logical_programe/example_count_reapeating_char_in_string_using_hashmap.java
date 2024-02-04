 package Logical_programe;

import java.util.HashMap;
import java.util.Set;

public class example_count_reapeating_char_in_string_using_hashmap {
	
	public static void main(String[] args) {
		String str ="abcabcaaad";
		HashMap<Character, Integer> mp=new HashMap<Character,Integer>();
		for (int i=0; i<=str.length()-1;i++)
		{char charvalue =str.charAt(i);
		if (mp.containsKey(charvalue))
		{mp.put(charvalue, mp.get(charvalue)+1);}
		else
		{mp.put(charvalue , 1);}}
		Set<Character>keys =mp.keySet();
		for( Character key:keys)
		{if (mp.get(key)>1) {
		System.out.println(key+" "+mp.get(key));
		}}
	}

}
