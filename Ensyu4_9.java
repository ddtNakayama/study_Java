import java.util.Scanner;

public class Ensyu4_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int intTarget = 0;

		while (intTarget <= 0) {
			System.out.print("nの値：");
			intTarget = scan.nextInt();
		}

		int idx = 1;
		int intResult = 1;

		while (idx <= intTarget) {
			intResult *= idx;
			idx++;
		}

		System.out.println("1から" + intTarget + "までの積は" + intResult + "です。");
	}

}
