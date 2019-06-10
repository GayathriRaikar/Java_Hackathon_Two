import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class DrinkType {

	public static void main(String[] args) {

		HashMap<String, Integer> myList = new HashMap<String, Integer>();

		myList.put("coke", 4);
		myList.put("sprite", 5);
		myList.put("limesoda", 3);
		myList.put("water", 7);
		myList.put("dietcoke", 8);
		myList.put("orangejuice", 0);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your drink type");

		String drinkType = scan.next();
		
		drinkType = drinkType.toLowerCase();

		for (Entry<String, Integer> entry : myList.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			if(drinkType.equals(key) && value >=1) {
				System.out.println("serving the drink " +key);
				value--;
			} else if(drinkType.equals(key) && value == 0) { 
				System.out.println("entered drink is out of stock " +value);
			}
		}
	}
}
