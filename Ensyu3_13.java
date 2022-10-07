import java.util.Scanner;

public class Ensyu3_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int result = 0;

		if (a > b) {
			if (a > c) {
				if (b > c) {
					System.out.println(b);
				} else {
					System.out.println(c);
				}
			}else{
				System.out.println(a);
			}
		}else if (b > c) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			System.out.println(b);
		}
	}
}
