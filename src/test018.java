//By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
//
//3
//7 4
//2 4 6
//8 5 9 3
//
//That is, 3 + 7 + 4 + 9 = 23.
//
//Find the maximum total from top to bottom of the triangle below:
//
//75
//95 64
//17 47 82
//18 35 87 10
//20 04 82 47 65
//19 01 23 75 03 34
//88 02 77 73 07 63 67
//99 65 04 28 06 16 70 92
//41 41 26 56 83 40 80 70 33
//41 48 72 33 47 32 37 16 94 29
//53 71 44 65 25 43 91 52 97 51 14
//70 11 33 28 77 73 17 78 39 68 17 57
//91 71 52 38 17 14 91 43 58 50 27 29 48
//63 66 04 68 89 53 67 30 73 16 69 87 40 31
//04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
//
//NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method!
public class test018 {

	public static void main(String[] args) {
		String [] str=new String[15];
		str[0]="75";
		str[1]="95 64";
		str[2]="17 47 82";
		str[3]="18 35 87 10";
		str[4]="20 04 82 47 65";
		str[5]="19 01 23 75 03 34";
		str[6]="88 02 77 73 07 63 67";
		str[7]="99 65 04 28 06 16 70 92";
		str[8]="41 41 26 56 83 40 80 70 33";
		str[9]="41 48 72 33 47 32 37 16 94 29";
		str[10]="53 71 44 65 25 43 91 52 97 51 14";
		str[11]="70 11 33 28 77 73 17 78 39 68 17 57";
		str[12]="91 71 52 38 17 14 91 43 58 50 27 29 48";
		str[13]="63 66 04 68 89 53 67 30 73 16 69 87 40 31";
		str[14]="04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
		String [][] nums=new String [15][15];
		int [][] sums=new int [15][15];
		for(int k=0;k<15;k++) {
			nums[k]=str[k].split(" ");
		}
		for(int i=0;i<15;i++)
			for(int j=0;j<=i;j++) {
				if(i==0)
					sums[0][0]=75;
				else {
					if(i!=j)
						sums[i][j]=sums[i-1][j];
					else sums[i][j]=sums[i-1][j-1];
					if(j!=0)
					if(sums[i][j]<sums[i-1][j-1])
						sums[i][j]=sums[i-1][j-1];
					sums[i][j]+=Integer.parseInt(nums[i][j]);
				}
			}
		int x=0;
		for(int n=0;n<15;n++)
			if(x<sums[14][n])
				x=sums[14][n];
		System.out.println(x);
	}

}
