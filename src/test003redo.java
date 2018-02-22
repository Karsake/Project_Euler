import java.math.BigInteger;

public class test003redo {

	public static void main(String[] args) {
		String str="600851475143";//if its not a prime number, there will be a factor small than 800000
		BigInteger in=new BigInteger(str);
		System.out.println(getLargePrime(in));

	}
	static BigInteger getLargePrime(BigInteger x) {
		long f=2;
		BigInteger t;
		BigInteger one=new BigInteger("1");
		BigInteger out=one;
		while(f<800000) {//if its not a prime number, there will be a factor small than 800000
		t=BigInteger.valueOf(f);
		if(isFactor(t,x)&&isPrime(f)) 
			out=t;
		t=t.add(one);
		f++;
		System.out.println(t);
		}
		return out;
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
	static boolean isFactor(BigInteger b,BigInteger a) {
		BigInteger temp=a.divide(b);
		temp=temp.multiply(b);
		return a.equals(temp);
	}
}

