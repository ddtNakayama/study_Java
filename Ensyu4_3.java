import java.util.Scanner;

public class Ensyu4_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("整数Ａ：");
		int a = scan.nextInt();
		System.out.print("整数Ｂ：");
		int b = scan.nextInt();

		int start = 0;
		int end = 0;

		if (a > b) {
			start = b;
			end = a;
		} else {
			start = a;
			end = b;
		}

		do {
			System.out.print(start + " ");
			start++;
		} while (end > start);

		System.out.println(start);

	}

}
