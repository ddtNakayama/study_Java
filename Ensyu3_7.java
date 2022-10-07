import java.util.Scanner;

public class Ensyu3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a > 0) {
			int b = a % 3;
			if(b == 0) {
				System.out.println("その値は3で割り切れます。");
			}else if(b == 1) {
				System.out.println("その値を3で割った余りは1です。");
			}else {
				System.out.println("その値を3で割った余りは2です。");
			}
		} else {
			System.out.println("正でない値が入力されました。");
		}
	}

}
