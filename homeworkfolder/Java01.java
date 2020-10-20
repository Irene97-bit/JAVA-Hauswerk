import java.util.Scanner;
public class Java01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer：");
		int number = input.nextInt();
		
		System.out.println(reverse(number));
		
	}
	public static int reverse(int number) {
		int reverseNumber = 0;
		while(number>0) {
			int figure = number % 10;
			reverseNumber = reverseNumber* 10 + figure;
			number = number / 10;
		}
		return reverseNumber;
    }
}
