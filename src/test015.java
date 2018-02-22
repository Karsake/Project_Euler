//Starting in the top left corner of a 2¡Á2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.
//
//
//How many such routes are there through a 20¡Á20 grid?
public class test015 {

	public static void main(String[] args) {
		long [][] path=new long[40][40];
		path[0][0]=1;
		for(int i=1;i<40;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0)
					path[i][0]=path[i-1][0];
				else if(j==i)
					path[0][i]=path[0][i-1];
				else path[i-j][j]=path[i-j-1][j]+path[i-j][j-1];
				
			}
			path[21][0]=0;
			path[0][21]=0;
		}
		for(int i=0;i<=20;i++)
		System.out.println(path[i][i]);
		System.out.println("______________");
		System.out.println(path[19][20]);
		System.out.println(path[20][19]+"\nthis two values adding together");
	}

}
