
public class test052 {

	public static void main(String[] args) {
		for(int i = 2 ; i < 1000000 ; i+=1) {
			System.out.println(i);
			if(containSameDigits(i,2*i))
				if(containSameDigits(i,3*i))
					if(containSameDigits(i,4*i))
						if(containSameDigits(i,5*i)){
							System.out.println(i);
							break;
						}
		}

	}

	static boolean containSameDigits(int a, int b) {
		int x = (a + "").length();
		int y = (b + "").length();
		double tempA,tempB;
		if(x != y)
			return false;
		for(int i = 0; i < x; i++) {
			tempA = Math.pow(10, i);
			for(int j = 0; j < x; j++) {
				tempB = Math.pow(10, j);
				if( (int)(a/tempA%10) ==  (int)(b/tempB%10)) {
					break;
				}
				if(j == x - 1)
					return false;
			}
		}
		return true;	
	}
}
