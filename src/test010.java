//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.
public class test010 {

	public static void main(String[] args) {
	
	long sum=2;
	for(int i=3;i<2000000;i+=2) {
		if(isPrime(i)) {
			sum+=i;
			System.out.println(i);
			}
	}
	System.out.println(sum);
	}
	
	static boolean isPrime(long x) {
		if(x/2*2==x)
			return false;
		long n=(long) Math.sqrt(x);
		for(long i=3;i<=n;i+=2) {
			if(x/i*i==x)
				return false;
		}
		return true;
	}
}
