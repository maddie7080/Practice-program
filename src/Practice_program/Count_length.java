package Practice_program;

public class Count_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =123456789;
		int length =0;
		
		while(number!=0) {
			number = number/10;
			length=length+1;
			
			
		}
		System.out.println("length of no is "+length);

	}

}
