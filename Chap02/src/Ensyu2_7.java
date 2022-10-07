import java.util.Random;

public class Ensyu2_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Random a = new Random();

		System.out.println("ランダムに出力した1桁の正数：" + (a.nextInt(9) + 1));
		System.out.println("ランダムに出力した1桁の負数：" + (a.nextInt(9) + 1) * -1);

		int b = a.nextInt(9) + 1;
		int c = a.nextInt(10);

		System.out.println("ランダムに出力した10桁の負数：" + (b * 10 + c));
	}

}
