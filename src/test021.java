public class test021 {

	public static void main(String[] args) {
		int sum=0;
		int n,m;
		for(int i = 0; i < 10000; i++) {
			n=getFactorSum(i);
			m=getFactorSum(n);
			if(m == i && i != n)
				sum += i;
		}
		System.out.print(sum);
	}

	static int getFactorSum(int x) {
		int n=0;
		for(int i=1; i<x;i++)
			if(isFactor(i,x))
				n+=i;
		return n;
	}
	
	static boolean isFactor(int x, int y) {
		if(y/x*x == y)
			return true;
		return false;
		
	}
}
