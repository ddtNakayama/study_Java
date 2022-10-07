import java.util.Scanner;

public class Ensyu4_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("整数値：");
		int intTarget = scan.nextInt();

		int intLen = 0;
		do {
			intTarget /= 10;
			intLen++;
		} while (intTarget != 0);

		System.out.println("その値は" + intLen + "桁です。");

	}

}
