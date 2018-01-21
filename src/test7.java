//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?
public class test7 {

	public static void main(String[] args) {
		int a=2;
		int n=10000;//n+1th
		for(int i=0;i<n;i++) {
			a=getNextPrime(a);
			System.out.println(a);
		}

	}

	static int getNextPrime(int x) {
		int n=x;
		do n++;
		while(!isPrime(n));
		return n;
	}
	static boolean isPrime(long x) {
		for(long i=2;i<x;++i) {
			if(x/i*i==x)
				return false;
		}
		return true;
	}
}
