import java.util.Scanner;

public class LAB_3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int[] Array = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter the " + (i+1) + " Element : ");
			Array[i] = stdin.nextInt();
		}
		
		int Max = 0;
		for(int i = 0; i < 10; i++) {
			if(Max <= Array[i]) {
				Max = Array[i];
			}
		}
		System.out.println(Max);
		
		
		int Min = Array[0];
		for(int i = 0; i < 10; i++) {
			if(Min >= Array[i]) {
				Min = Array[i];
			}
		}
		System.out.println(Min);

	}
}
