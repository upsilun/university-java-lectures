import java.util.Scanner;
public class LAB_1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] Array = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter the " + i + " Element : ");
			Array[i] = stdin.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("" + Array[i] + "");
		}
	}
}