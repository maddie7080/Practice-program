package Practice_program;

public class Reverse {
	public static void main(String[]args) {
	int number =12345;
	
	int reminder = 0;
	
	int reverse_no =0;
	
	while(number!=0) {
		reminder =number%10;
		
		reverse_no = reverse_no*10+reminder;
		
		number = number/10;
		
	}
	System.out.println(reverse_no);
  

}
}