package week1.day2;
import java.util.Arrays;
public class FindMissingElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,3,2,8,6,7};
int m;
Arrays.sort(a);
for(int i=0; i<a.length; i++) {
	if(a[i]!=i+1) {
		m=i+1;
		System.out.println("The missing number is:" +m);
		break;
	}
		
	}
}
	}
