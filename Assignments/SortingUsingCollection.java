package week3.day2.Assignments;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {

	public static void main(String[] args) {
				
		//sorting an array

		String[] names = {"Google","Microsoft","Wipro", "HCL" , "CTS", "Aspire Systems","TestLeaf","Maverick"};
		
		int len = names.length;
		
		Arrays.sort(names);
		
		System.out.println("Sorting in desc an array:");
		
		for(int i=len-1; i>=0 ; i--)
		{
			System.out.println(names[i]);
		}
		
		//sorting a list
		
		List<String> newlist = Arrays.asList(names);
		
		Collections.sort(newlist);
		
		System.out.println("Sorting in asc a list :" + newlist);
		
		Collections.reverse(newlist);
		
		System.out.println("Sorting in desc a list :" + newlist);
		
		//sorting a set
		
		Set<String> setter = new TreeSet<String>();
		
		for(String n:names)
		{
			setter.add(n);
		}
		
		System.out.println("treeset has asc ordered names " + setter);
		
		//convert to list and reverse the order...
		
		
		
	}

}
