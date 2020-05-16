import java.util.Scanner;
public class primenum {
	//this program finds whether the given number is a prime number or not
	public static void main(String args[]) {
		int i,num;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		if(num>1) {
			//as 0 and 1 are neither prime nor composite numbers
			for(i=2;i<num/2;i++) {
				if(num%i==0)
					isPrime=false;
				
			}
			if(isPrime)
				System.out.println(num +"is  a prime number ");
			else
				System.out.println(num +"is  a composite number ");
		}
		else
			System.out.println(num +"is neither a prime number nor a composite number");
		
			
		
	}
}