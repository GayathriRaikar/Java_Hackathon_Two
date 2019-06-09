// Write a java program to store 5 student information and award the students with 
// 1st rank, 2nd rank and 3rd rank according to marks obtained where each student 
// has student name, student marks and student reg no information.

import java.util.ArrayList;
import java.util.Collections;

public class EntryStudentAward {

	public static void main(String[] args) {

		StudentAward s1 = new StudentAward("Amit", 1, 599.3);
		StudentAward s2 = new StudentAward("Mathew", 2, 598.9);
		StudentAward s3 = new StudentAward("John", 3, 599.8);
		StudentAward s4 = new StudentAward("Sam", 4, 596.7);
		StudentAward s5 = new StudentAward("Paul", 5, 599.9);

		ArrayList<StudentAward> stuArray = new ArrayList<StudentAward>();
		ArrayList<StudentAward> firstThreeMaxScoreArray = new ArrayList<StudentAward>();

		stuArray.add(s1);
		stuArray.add(s2);
		stuArray.add(s3);
		stuArray.add(s4);
		stuArray.add(s5);

		double firstMaxScore = 0, secondMaxScore = 0, thirdMaxScore = 0;

		for(StudentAward elem : stuArray) {

			if(firstMaxScore < elem.stuScore) {
				thirdMaxScore = secondMaxScore;
				secondMaxScore = firstMaxScore;
				firstMaxScore = elem.stuScore;
				firstThreeMaxScoreArray.add(elem);

			} else if( secondMaxScore < elem.stuScore ) {
				thirdMaxScore = secondMaxScore;
				secondMaxScore = elem.stuScore;

			} else if( thirdMaxScore < elem.stuScore) {
				thirdMaxScore = elem.stuScore;
				firstThreeMaxScoreArray.add(elem);
			}

		}

		Collections.sort(firstThreeMaxScoreArray);

		System.out.println("Students with Third, Second and First rank are ");
		for( StudentAward elem : firstThreeMaxScoreArray ) {
			System.out.println(elem.stuName + "'s score is = " + elem.stuScore);

		}
	}

}
