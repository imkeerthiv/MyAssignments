package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=8, n1=0, n2=1;
System.out.println("The Fibonacci series till Range 8 are:");
for(int i=1; i<=count; ++i) {
	System.out.println(n1 +" ");
	int n3=n1+ n2;
	n1=n2;
	n2=n3;
}
	}

}
