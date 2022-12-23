package Week_3.Day_2.Class_Room;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> mentors = new LinkedHashSet<String>();
		mentors.add("Haja");
		mentors.add("Hari");
		mentors.add("Babu");
		mentors.add("Balaji");
		mentors.add("Hari");
		
		System.out.println(mentors);
	}

}