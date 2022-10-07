import java.util.Random;
import java.util.Scanner;

public class Ensyu2_9 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		System.out.println("0.0以上1.0未満 ：" + random.nextDouble());
		System.out.println("0.0以上10.0未満：" + (random.nextInt(10) + random.nextDouble()));
		System.out.println("-1.0以上1.0未満：" + (-1 + random.nextInt(2) + random.nextDouble()));
	}

}
