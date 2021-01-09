package Day2.arrays;

public class Eg6 {

	public static void main(String[] args) {
		int[][] numSqr = {{2,3,4},{4,9,16}} ;
		for (int i=0;i<numSqr.length;i++) {
			int[] innerarray = numSqr[i];
					for(int j=0;j<innerarray.length;j++) {
						System.out.println(numSqr[i][j]);
					}
		}
	}

}
