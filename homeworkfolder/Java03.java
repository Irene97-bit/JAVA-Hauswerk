public class Java03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[100];
		int[] counts=new int[10];
		for(int i=0; i<100; i++) {
			numbers[i]=(int) (random_number());
			counts[numbers[i]]++;
		}
		for(int i=0; i<100; i++) {
	    	System.out.print(numbers[i]);
		}
		System.out.println();
	    for(int i=0; i<10; i++) {
	    	System.out.println(i+" shows: "+counts[numbers[i]]+" times."); 
	    }
	}

    public static int random_number(){//to generate 100 random integers between 0 to 9
    	int number;
    	number = (int)(10* Math.random());
    	return number;  			
    }
}
