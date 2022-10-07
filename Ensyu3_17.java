import java.util.Random;
import java.util.Scanner;

public class Ensyu3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int a = random.nextInt(3);

		switch (a) {
		case 0:
			System.out.println("グー");
			break;
		case 1:
			System.out.println("チョキ");
			break;
		case 2:
			System.out.println("パー");
			break;
		}

	}

}
