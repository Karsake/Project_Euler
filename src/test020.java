import java.math.BigInteger;

//n! means n × (n − 1) × ... × 3 × 2 × 1
//
//For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
//and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
//
//Find the sum of the digits in the number 100!
public class test020 {

	public static void main(String[] args) {
		BigInteger temp;
		BigInteger product=new BigInteger("1");
		int end=100;
		for(int i=1;i<=end;i++) {
			temp=new BigInteger(i+"");
			product=product.multiply(temp);
		}
		String result=product.toString();

		int sum=0;
		while(result.length()>0) {
			sum+=Integer.parseInt(result.substring(result.length()-1, result.length()));
			result=result.substring(0,result.length()-1);
		}
		System.out.println(sum);
	}
	
	
}
