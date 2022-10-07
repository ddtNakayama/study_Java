import java.util.Scanner;

public class Ensyu3_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("整数Ａ：");
		int a = scan.nextInt();
		System.out.print("整数Ｂ：");
		int b = scan.nextInt();

		int c = a > b ? a - b : b - a;

		if (c <= 10) {
			System.out.println("それらの差は10以下です。");
		} else {
			System.out.println("それらの差は11以上です。");
		}
	}
}
