
public class test1 {
	public static void main(String[] args) {
		int x,y,z;
		x=getSum(3,1000);
		y=getSum(5,1000);
		z=getSum(15,1000);
		System.out.println(x+y-z);
		System.out.println(getSum(3,12));
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
