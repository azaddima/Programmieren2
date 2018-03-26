package hochschule;

import java.util.ArrayList;

public class UniversityMain {


	public static void main(String[] args) {
	
		ArrayList<Person> members = new ArrayList<>();
		members.add(new Professor("Emil", "Schulz", "1992832", "SLZ"));
		members.add(new Student("Alexander", "Mayer", "1162423", "aad998"));
		members.add(new Student("Mira", "Martens", "1322283", "aae162"));
		members.add(new Student("Lisa", "Spurt", "1162228", "aac826"));
		members.add(new Student("Thorsten", "Larsen", "1128737", "aae918"));
		
		System.out.println("Lecturers:");

		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) instanceof Professor) {
				System.out.println(members.get(i));
			}
		}
		
		System.out.println("\nStudents:");
		
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i) instanceof Student) {
				System.out.println(members.get(i));
			}
		}

	}
	
	
}
