package week10;



import java.util.Scanner;

public class Rectange {
		int width;
		int height;
		
		public int getArea() {
		return width*height;	
		}
		public static void main(String[] args) {
			Rectange rect = new Rectange();
			Scanner scanner = new Scanner(System.in);
			System.out.print(">>");
			
			rect.width= scanner.nextInt();
			rect.height = scanner.nextInt();
			
			System.out.println("사각형의 면적은"+ rect.getArea());
			
			scanner.close();
			
		}
}
