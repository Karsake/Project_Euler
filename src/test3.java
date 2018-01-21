import java.math.BigInteger;

//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?
public class test3 {
/**
 * terrible method, take days
 * @param args
 */
	public static void main(String[] args) {
		String str="600851475143";
//		String s="12345";
//		BigInteger inn=new BigInteger(s);
//		System.out.println(getLargestPrime(inn));
		BigInteger in=new BigInteger(str);
		System.out.println(getLargestPrime(in));

	}

	static BigInteger getLargestPrime(BigInteger x) {
		BigInteger p=new BigInteger("1");
		BigInteger f=new BigInteger("2");
		BigInteger one=new BigInteger("1");
		BigInteger zero=new BigInteger("0");
		BigInteger temp=zero;
		while(f.compareTo(x)==-1||f.compareTo(x)==0) {
			if(isFactor(f,x)) {
			temp=getLargestFactor(f);
			if(temp.equals(zero))
				p=f;
			}
			f=f.add(one);
			System.out.println(f);
		}
		return p;
	}
	/**
	 * if return 0,this number y is a prime number
	 * @param y
	 * @return
	 */
	static BigInteger getLargestFactor(BigInteger y) {
		BigInteger n=new BigInteger("2");
		BigInteger f=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		while(n.compareTo(y)==-1) {
			if(isFactor(n,y)) {
				f=n;
			}
			n=n.add(one);
		}
		return f;
	}
	

	static boolean isFactor(BigInteger b,BigInteger a) {
		BigInteger temp=a.divide(b);
		temp=temp.multiply(b);
		return a.equals(temp);
	}
}
