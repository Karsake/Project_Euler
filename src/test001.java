//	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
//	The sum of these multiples is 23.
//
//	Find the sum of all the multiples of 3 or 5 below 1000.
public class test001 {
	public static void main(String[] args) {
		int x,y,z;
		x=getSum(3,1000);
		y=getSum(5,1000);
		z=getSum(15,1000);
		System.out.println(x+y-z);
		//Output 233168
	}

	static int getSum(int a,int b) {
		int sum=0;
		int x=(b-1)/a;
		while(x>0) {
			sum+=x;
			x--;
		}
		return sum*a;
	}

}
