//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 ¡Á 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.
public class test4 {

	public static void main(String[] args) {
		int i=getNextInt();
		System.out.println(i);

	}

	static int getNextInt() {
		int a=0;
		for(int i=1000;i>100;i--) 
			for(int j=1000;j>=i;j--){
			if(isPalindrome(i*j))
				if(i*j>a)
					a=i*j;
		}
		return a;
	}
	static boolean isPalindrome(int a) {
		String x=a+"";
		int l=x.length();
		while(l>1) {
			if(!x.substring(0,1).equals(x.substring(l-1,l)))
				return false;
			x=x.substring(1,l-1);
			l=x.length();
		}
		return true;
	}
}
