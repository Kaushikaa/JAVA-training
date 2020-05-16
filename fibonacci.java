
public class fibonacci {
	public static void main(String args[]) {
		int n=10;
		int a=0,b=1,next;
		System.out.println("The fibonacci series when n=10 is");
		for(int i=0;i<n;i++) {
			if(i<=1)
				next=i;
			else
				next=a+b;
				a=b;
				b=next;
			System.out.println(next);
		}
	}
}

