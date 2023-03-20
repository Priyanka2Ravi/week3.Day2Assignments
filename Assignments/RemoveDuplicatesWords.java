package week3.day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] unique = text.split(" ");
		
		Set<String> words = new LinkedHashSet<String>();
		
		for(String s:unique)
		{
			words.add(s);
		}
		
		System.out.println(words);
		
	}

}
