import java.util.Scanner;

public class Ensyu2_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		System.out.println("三角形の面積を求めます。");
		System.out.print("底辺：");
		double width = scan.nextDouble();
		System.out.print("高さ：");
		double height = scan.nextDouble();
		
		double result = width * height /2;
		
		System.out.println("面積は"+result+"です。");
		
	}

}
