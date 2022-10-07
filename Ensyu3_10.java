import java.util.Scanner;

public class Ensyu3_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a > b ? a - b : b - a);
	}

}
