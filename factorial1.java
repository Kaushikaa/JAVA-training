import java.util.Scanner;
//finding factorial if a number using recursive function
public class factorial1 {
	static int facto(int n) {
		if(n==0)
			return 1;
		else
			return(n*facto(n-1));//here the facto() method is called recursively.
	}
	public static void main(String args[]) {
		int num,fact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		num=sc.nextInt();
		sc.close();
		fact=facto(num);
		System.out.println("the factorial of the number is "+fact+".");	
		
	}
}
