import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("student.txt"));
		List<String> students = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			students.add(scanner.nextLine());
		}
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println("Name: " + students.get(i));
		}
		
		scanner.close();
		
	}
}