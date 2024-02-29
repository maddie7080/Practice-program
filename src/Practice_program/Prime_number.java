package Practice_program;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =23;
		int y=0;
		
		for(int i=2;i<=number;i++) {
			if(number%i==0) {
				y=y+1;
			}
		}
		if(y>0)
			System.out.println("Number is not prime");
		else
			System.out.println("Number is prime number");

	}

}
