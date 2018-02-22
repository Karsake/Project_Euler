//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
//
//What is the sum of the digits of the number 2^1000?
public class test016 {

	public static void main(String[] args) {
		String a="1";
		for(int i=0;i<1000;i++) {
			a=getDoubledResult(a);
		}
		System.out.println(a);
		System.out.println(getSum(a));
	}

	static String getDoubledResult(String num) {
		int l=num.length();
		String result="";
		int temp;
		Boolean isAboveTen=false;
		for(int i=0;i<=l;i++) {
			temp=0;
			if(i!=l)
				temp=Integer.parseInt(num.substring(l-i-1, l-i));
			temp=temp*2;
			if(isAboveTen)
				temp+=1;
			isAboveTen=false;
			if(temp>=10) {
				temp=temp-10;
				isAboveTen=true;
			}
			result=temp+result;
		}
		if(result.startsWith("0"))
			result=result.substring(1,l+1);
		return result;
		
	}
	
	static int getSum(String num) {
		int sum=0;
		int l=num.length();
		int temp;
		for(int i=0;i<l;i++) {
			temp=Integer.parseInt(num.substring(i, i+1));
			sum+=temp;
		}
		return sum;
		
	}
}
