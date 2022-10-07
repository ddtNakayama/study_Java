import java.util.Scanner;

public class Ensyu4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int retry = 0;
		
		do {

			System.out.print("整数値：");
			int n = stdIn.nextInt();

			if (n > 0) {
				System.out.println("その値は正です。");
			} else if (n < 0) {
				System.out.println("その値は負です。");
			} else {
				System.out.println("その値は０です。");
			}

			System.out.println("もう一度？ 1…Yes／それ以外…No：");
			
			retry = stdIn.nextInt();
			
		} while (retry == 1);
	}

}
