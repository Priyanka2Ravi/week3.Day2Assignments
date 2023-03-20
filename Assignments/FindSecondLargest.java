package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7,2,3,3,6,13,10,12,12,13,9,7};
		
		Set<Integer> dataset = new TreeSet<Integer>();
		
		for(Integer i:data)
		{
			dataset.add(i);
		}
		System.out.println("Original list of numbers after removing duplicates: " + dataset);
		
		List<Integer> newlist = new ArrayList<Integer>(dataset);
		
		int len = newlist.size();
		
		System.out.println("Second Largest number in the sorted list is "+ newlist.get(len-2));
		
		
	}

}
