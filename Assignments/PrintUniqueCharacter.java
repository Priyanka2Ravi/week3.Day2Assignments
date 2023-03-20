package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;


public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Nagangir";
		
						
		char[] ch = name.toLowerCase().toCharArray();
		
		System.out.println(ch);
		 
		Set<Character> namechar = new LinkedHashSet<Character>();
		
		for(char c: ch)
		{
			boolean flag = namechar.add(c);
			if(!flag)
			{
				System.out.println(c);
			}
		}
		
		System.out.println("Displaying name without repetitive char " + namechar);
		
		
		
	
				
	}

}
