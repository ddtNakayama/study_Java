import java.util.Scanner;

public class Ensyu3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.print("整数Ａ：");
		int a = scan.nextInt();
		System.out.print("整数Ｂ：");
		int b = scan.nextInt();
		
		int result = a % b;
		
		if(result == 0) {
			System.out.println("ＢはＡの約数です。");
		}else {
			System.out.println("ＢはＡの約数ではありません。");
		}
	}

}
