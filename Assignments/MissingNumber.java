package week3.day2.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {3,1,2,5,8,9,4,10,6};

		List<Integer> num = new ArrayList<Integer>();
		
		for(int i=0; i<num1.length;i++)
		{
		num.add(num1[i]);
		}
		
		System.out.println("Initial List " + num);
		
		Set<Integer> sortnum = new TreeSet<Integer>(num);
		
		System.out.println("Sorted treeset List " + sortnum);
		
		int i=1;
		
		for(int r:sortnum)
		{
			if(r!=i)
			{
				System.out.println(i);
				break;
				
			}
			i = i+1;
			
		}
		
	}

}
