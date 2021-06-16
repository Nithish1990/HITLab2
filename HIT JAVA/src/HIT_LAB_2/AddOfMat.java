package HIT_LAB_2;

public class AddOfMat {
	public static void main(String[] args) {
		int [][]x= {{2,5,3},{3,5,1},{4,6,7}};
		int [][]y= {{5,2,5},{6,2,2},{1,6,2}};
		int [][]z= new int [3][3];
		for (int i=0;i<3;i++) {
			for(int j = 0;j<3;j++) {
				z[i][j] = x[i][j]+  y[i][j];
			}
		}for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
	}
}
