import java.util.Scanner;

public class armstrong {
	public static void main(String args[]) {
		int a,ans = 0;
		int num,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		sc.close();
		temp=num;
		while(num>0) 
		{
			a=num%10;
			ans=ans+(a*a*a);
			num=num/10;
		}
		if(temp==ans)
		{
			System.out.println(temp+" is a Armstrong number");}
		
		else
			System.out.println(temp+" is not a Armstrong number");
		}

}
