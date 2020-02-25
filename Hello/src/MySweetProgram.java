import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MySweetProgram {

	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		names.push("Mark");
		names.push("Sue");
		names.push("Tim");

		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
	}
}