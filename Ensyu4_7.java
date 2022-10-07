import java.util.Scanner;

public class Ensyu4_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("何個表示しますか：");
		int a = scan.nextInt();
		
		if(a > 0) {
			
			int i = 0;
			int cnt = 0;
			char mark;
			
			while(a > i) {
				if(cnt == 0) {
					mark = '*';
				}else {
					mark = '+';
				}
				cnt = (cnt + 1) % 2;
				
				System.out.print(mark);
				i++;
			}
		}

	}

}
