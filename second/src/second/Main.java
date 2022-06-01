package second;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("hello ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int x = scanner.nextInt();
		while(x<10) {
			x++;
			System.out.println(x);
		}
		/*for (int i=0; i<10; i++) {
			System.out.println(i);
			
		}
		*/
		int[] num = {6,3,7,4,8,5};
		for (int i=0; i<=5; i++) {
			System.out.println(num[i]);
			
		}

	}

}
