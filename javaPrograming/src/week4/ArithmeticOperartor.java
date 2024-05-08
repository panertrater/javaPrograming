package week4;

import java.util.*;

public class ArithmeticOperartor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("정수를 입력하시오:");
		long time= scanner.nextLong();
		long second = time % 60;
		long minute = (time/60)%60;
		long hour = (time/3600);
		
		System.out.println(time +"초는");
		System.out.println(hour+"시간,");
		System.out.println(minute + "분");
		System.out.println(second +"초입니다");
		
		scanner.close();
		
		
	}
}
