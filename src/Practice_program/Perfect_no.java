package Practice_program;

public class Perfect_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 6;
		int sum =0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		if(sum==number)
			System.out.println("Number is perfect no");
		else
			System.out.println("Number is not perfect no");

	}

}
