import java.util.Scanner;

public class Ensyu3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println("aのほうが大きいです。");
		}else if (b > a) {
			System.out.println("bのほうが大きいです。");
		}else {
			System.out.println("aとbは同じ値です。");
		}
	}

}
