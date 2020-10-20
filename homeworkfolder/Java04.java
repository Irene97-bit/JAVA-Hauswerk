import java.util.Scanner;
public class Java04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten integers：");
		int [] n=new int[10];
		for(int i=0; i<10; i++) {
			n[i]=input.nextInt();
			System.out.print(n[i]+" ");
		}
		System.out.println(" is your number list.");
		System.out.println("The minimum's index is："+indexOfSmallestElement(n));
	}
	public static int indexOfSmallestElement(int[] numberlist) {
		int indexOfSmall=0;
		int min=numberlist[0];
		if(numberlist.length>1) {
		for(int i=1; i<numberlist.length; i++) {
			if(numberlist[i]<min) {
				min=numberlist[i];
				indexOfSmall=i;
			  }
		    }
			return indexOfSmall;
		}
		else {
			return 0;
		}
	}
}
