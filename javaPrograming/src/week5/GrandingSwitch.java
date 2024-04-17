package week5;

import java.util.Scanner;

public class GrandingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String grade;
		System.out.print("점수를 입력하세요(0~100)");
		int score = scanner.nextInt();
		switch (score/10) {
		case 10://90점부터 100점까지 A
		case 9:
			grade = "A";
			break;
		case 8:// 80점부터 90점까지 B
			grade = "B";
			break;
		case 7://7080
			grade = "C";
			break;
		case 6://60 70
			grade = "D";
			break;
		default:
			grade = "F";
		
			
		}
		System.out.println("학점은" + grade + "입니다.");
		
		scanner.close();
	}
}
