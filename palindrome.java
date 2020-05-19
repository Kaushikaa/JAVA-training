import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
	int rem,ans = 0;
	int num,temp;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	temp=num;
	while(num>0) 
	{
		rem=num%10;
		ans=(ans*10)+rem;
		num=num/10;
	}
	if(temp==ans)
	{
		System.out.println(temp+" is a Palindrome number");}
	
	else
		System.out.println(temp+" is not a Palindrome number");
	}
}


