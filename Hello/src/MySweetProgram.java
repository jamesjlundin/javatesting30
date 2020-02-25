import java.util.*;
public class MySweetProgram {

	public static void main(String[] args) {
		
		int[][] data = {
				{0, 1, 1, 0, 1},
				{1, 1, 0, 1, 0},
				{1, 0, 2, 1, 0}
		};
		
		for(int i = 0; i < data.length; i ++) {
			for(int k = 0; k < data[i].length; k++) {
				System.out.print(data[i][k] + " ");
			}
			System.out.println();
		}
	}
}