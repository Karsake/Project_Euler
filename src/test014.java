//The following iterative sequence is defined for the set of positive longegers:
//
//n �� n/2 (n is even)
//n �� 3n + 1 (n is odd)
//
//Using the rule above and starting with 13, we generate the following sequence:
//
//13 �� 40 �� 20 �� 10 �� 5 �� 16 �� 8 �� 4 �� 2 �� 1
//It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
//
//Which starting number, under one million, produces the longest chain?
//
//NOTE: Once the chain starts the terms are allowed to go above one million.
public class test014 {

	public static void main(String[] args) {
		long max=0;
		long n=0;
		long cur;
		for(long i=1;i<1000000;i++) {
			cur=getTimes(i);
			if(cur>max) {
				max=cur;
				n=i;
				System.out.println(max+"|"+n);
			}
		}
	}

	static long getTimes(long x) {
		long n=0;
		while(true) {
			
			if(x==1)
				return n;
			if(x%2==0) {
				x=x/2;	
				n++;
				continue;
			}else {
				x=x*3+1;
				n++;
				continue;
			}
			}
	}
}
