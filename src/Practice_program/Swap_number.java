package Practice_program;

public class Swap_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		System.out.println("value of no a before swap is "+a);
		System.out.println("Value of no b before swap is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a after swapping is "+a);
		System.out.println("value of b after swapping is "+b);

	}

}
