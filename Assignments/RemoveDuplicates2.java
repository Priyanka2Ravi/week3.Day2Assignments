package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String company = "PayPal India";
		
		char[] ch = company.toCharArray();
		
		Set<Character> charset = new LinkedHashSet<Character>();
		
		Set<Character> dupcharset = new LinkedHashSet<Character>();
		
		for(char c:ch)
		{
			boolean flag = charset.add(c);
			if(!flag)
			{
				dupcharset.add(c);
			}
			
		}
		
		System.out.println("Unique Characters are : " + charset);
		System.out.println("Duplicate Characters are : "+ dupcharset);
		
		
		charset.removeAll(dupcharset);
		System.out.println("after removing duplicate characters : " + charset);
		
		Set<Character> newcharset = new LinkedHashSet<Character>();
		
		for(char c:charset) {
			
			if(c != ' ')
			{
				newcharset.add(c);
			}
					}
		System.out.println(newcharset);
		
		
	}

}
