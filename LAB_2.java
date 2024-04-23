import java.util.Scanner;
public class LAB_2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] Array = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter the " + (i+1) + " Element : ");
			Array[i] = stdin.nextInt();
		}
		
		for(int i = 2; i >= 0; i--) {
			System.out.println(Array[i]);
		}
	}
}