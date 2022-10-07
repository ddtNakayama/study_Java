import java.util.Scanner;

public class Ensyu4_21 {

	public static void main(String[] args) {

		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.println("左下直角の三角形を表示します。");
		System.out.print("段数は：");

		// キーボードから入力を受け付ける
		int n = stdIn.nextInt();

		// 高さ
		for (int i = 1; i <= n; i++) {
			// 底辺
			for (int j = n; j >= i; j--) {
				System.out.print('*');
			}
			// 改行
			System.out.println();
		}
	}

}
