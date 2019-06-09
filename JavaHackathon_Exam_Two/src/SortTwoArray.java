// WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 
// array2[4] = 3, 5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortTwoArray {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 =  new ArrayList<Integer>();
		ArrayList<Integer> arr2 =  new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(4);
		arr1.add(6);
		arr1.add(9);
		arr1.add(10);
		
		arr2.add(3);
		arr2.add(5);
		arr2.add(7);
		arr2.add(8);

		arr1.addAll(arr2);
		
		Collections.sort(arr1);
		
		Iterator<Integer> itr = arr1.iterator();
		
		System.out.println("Sorted array after merge ");
		while (itr.hasNext()) {
			System.out.print(itr.next() +" ");
			
		}
 	}
}
