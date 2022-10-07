import java.util.Scanner;

public class Ensyu4_19 {

	public static void main(String[] args) {
		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		// 再実施判定用 
		int retry;
		// 入力された月
		int month;

		do {
			// 1～12以内の値が入力されるまでループ
			do {
				System.out.print("季節を求めます。\n何月ですか：");
				// キーボードから入力を受け付ける
				month = stdIn.nextInt();
			} while (month > 12 || month < 1);

			// 3～5
			if (month >= 3 && month <= 5) {
				System.out.println("それは春です。");
			// 6～8
			} else if (month >= 6 && month <= 8) {
				System.out.println("それは夏です。");
			// 9～11
			} else if (month >= 9 && month <= 11) {
				System.out.println("それは秋です。");
			// 12～2
			} else if (month == 12 || month == 1 || month == 2) {
				System.out.println("それは冬です。");
			}
			
			System.out.print("もう一度？ 1…Yse／0…No：");
			// キーボードから入力を受け付ける
			retry = stdIn.nextInt();
			
		} while (retry == 1);
	}

}
