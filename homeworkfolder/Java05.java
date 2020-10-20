import java.util.Scanner;

public class Java05 {

	public static void main(String[] args) {
		double[][] m=new double[4][4];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your 4X4 matrix row by row: ");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				m[i][j]=input.nextDouble();
			}
		}
		System.out.println("Sum of the major diagonal is "+sumMajorDiagonal(m));  
	}

	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for(int i=0; i<4; i++) {
			sum += m[i][i];
		}
		return sum;
	}
}
