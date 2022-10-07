import java.util.Scanner;

public class Ensyu3_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		System.out.print("月を入力：");
		int month = scan.nextInt();
		String message = "";

		switch (month) {
		case 12:
		case 1:
		case 2:
			message = "冬";
			break;
		case 3:
		case 4:
		case 5:
			message = "春";
			break;
		case 6:
		case 7:
		case 8:
			message = "夏";
			break;
		case 9:
		case 10:
		case 11:
			message = "秋";
			break;
		default:
			message = "無し";
		}

		System.out.println(message);
	}

}
