//By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values: 13, 23, 43, 53, 73, and 83, are all prime.
//
//By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example having seven primes among the ten generated numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently 56003, being the first member of this family, is the smallest prime with this property.
//
//Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits) with the same digit, is part of an eight prime value family.
public class test051 {
	
	public static void main(String[] args) {
		int temp=0;
		int r;
		//assume that the number is not greater than 1000000
		int n=999999;
		String numStr;
		boolean mark=false;
		for(int i=101;i<n;i+=2) {
			if(!isPrime(i))
				continue;
			temp=i/10;
			numStr=temp+"";
			for(int j=0;j<numStr.length();j++) {
				r=temp%10;
				temp=temp/10;
				if(hasEightPrime(i,r)) {
					System.out.println("answer"+i);
					mark=true;
					break;
				}
			}
			if(mark)break;
		}
	}
	
	static boolean isPrime(long x) {
		if(x%2==0&&x!=2)
			return false;
		for(long i=3;i<x;i+=2) {
			if(x/i*i==x)
				return false;
		}
		return true;
	}

	static boolean hasEightPrime(int inNum,int r) {
		String str;
		int notPrimeCount=0;
		int num;
		long temp;
		System.out.println("in "+inNum+""+" r "+r);
		for(int i=0;i<=9;i++){
			if(notPrimeCount>2)
				break;
			str=inNum/10+"";
			str=str.replace(r+"", i+"");
			num=Integer.parseInt(str+inNum%10);
			temp=num;
			if(!isPrime(temp))
			notPrimeCount++;
			else if((num+"").length()!=(inNum+"").length())
				notPrimeCount++;
			if(isPrime(temp))System.out.println("aaa"+temp);
		}
		if(notPrimeCount==2)
			return true;
		return false;
	}
}
