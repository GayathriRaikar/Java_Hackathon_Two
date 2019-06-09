// Write a java program to store 5 students information in a treeMap
// Note: student object has student name and student reg no.

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentInfo {

	public static void main(String[] args) {

		TreeMap<String, Integer> stuList = new TreeMap<String, Integer>();
		
		stuList.put("Amit", 1);
		stuList.put("John", 2);
		stuList.put("Mathew", 3);
		stuList.put("Madison", 4);
		stuList.put("Sachin", 5);
	
		System.out.println("Student names and register numbers are listed below");
		for (Entry<String, Integer> entry : stuList.entrySet()) {
		    String key = entry.getKey();
		    Integer value = entry.getValue();
		    System.out.printf("%s : %s\n", key, value);
		}
	}
}
