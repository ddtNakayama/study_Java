import java.util.Scanner;

public class Ensyu3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		if(a > 0) {
			if(a % 10 == 0) {
				System.out.println("その値は10の倍数です。");
			}else {
				System.out.println("その値は10の倍数ではありません。");
			}
		}else {
			System.out.println("正でない値が入力されました。");
		}
	}

}
