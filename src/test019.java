
public class test019 {

	public static void main(String[] args) {
		int[] days= {31,28,31,30,31,30,31,31,30,31,30,31};
		int count=0;
		int temp;
		int year=2000;
		temp=getDays(1901);
		for(int i=1901;i<=year;i++) {
			if(isLeapYear(i))
				days[1]=29;
			else days[1]=28;
			for(int j=0;j<12;j++) {
				temp+=days[j];
				if(isSunday(temp))
					count++;
			}
		}
		System.out.println(count);

	}

	static int getDays(int years) {
		int n=0;
		if(years>1900) {
			n=(years-1900)*365;
			n+=(years-1900)/4+1;
			n-=(years-1800)/100;
			if(years>=2000)
			n-=(years-2000)/400+1;
			return n;
		}
		return 0;
	}
	
	static boolean isSunday(int days) {
		if(days%7==6) {
			return true;
		}
		return false;
	}
	
	static boolean isLeapYear(int year) {
		if(year%4!=0)
			return false;
		if(year%100==0) {
			if(year%400==0)
				return true;
			else return false;
		}
		return true;
	}
}
