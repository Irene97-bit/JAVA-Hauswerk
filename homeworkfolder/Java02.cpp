import java.util.Scanner;
public class Java02 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter an integer(n) :");
		int n=input.nextInt();
		
		printMatrix(n);
		}
	
	public static void printMatrix(int n) {
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=n; j++) {
				System.out.printf("%2d", (int) (2*Math.random()));
				}
			System.out.println();
			}
		}

}
