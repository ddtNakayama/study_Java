import java.util.Scanner;

public class Ensyu3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a > 0) {
			if(a % 5 == 0) {
				System.out.println("その値は5で割り切れます。");
			}else {
				System.out.println("その値は5で割り切れません。");
			}
		}else {
			System.out.println("正でない値が入力されました。");
		}
	}

}
