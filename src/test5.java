//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
public class test5 {

	public static void main(String[] args) {
		System.out.println(getSmallestMultiple(20));

	}

	static long getSmallestMultiple(long x) {
		long n=1;
		for(long i=1;i<=x;i++)
			n=getProduct(n,i);
		return n;		
	}
	static long getProduct(long x,long y) {
		return x*y/getFactor(x,y);
	}
	static long getFactor(long x,long y) {
		long n=1;
		for(long i=1;i<=x;i++)
		{
			if(x/i*i==x&&y/i*i==y)
				n=i;
		}
		return n;
	}
}
