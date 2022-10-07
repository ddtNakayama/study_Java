import java.util.Scanner;

public class Ensyu4_18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 標準入力
		Scanner stdIn = new Scanner(System.in);

		System.out.print("nの値：");

		// キーボードから入力を受け付ける
		int intInput = stdIn.nextInt();

		// インデックス
		int i = 1;

		do {
			System.out.println(i + "の２乗は" + (i * i));
			
			// 入力された値によってインデックスを更新する
			if(intInput > 0) {
				i++;
			}else {
				i--;
			}

		} while (intInput != i);
		
		// ループを抜けた後の同値の出力
		System.out.println(i + "の２乗は" + (i * i));

	}

}
