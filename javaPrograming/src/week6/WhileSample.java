package week6;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
 
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        while (n != -1) { // 사용자가 -1을 입력할 때까지 반복합니다.
            sum += n;
            count++;
            n = scanner.nextInt();
        }
        if (count == 0)
            System.out.println("입력된 수가 없습니다");
        else {
            System.out.println("정수의 개수는" + count + "개이며");
            System.out.println("평균은" + (double)sum/count + "입니다");
        }
        scanner.close();
    }
}
