public class MatrixMult {
	private static int c[][];
	private static int num;
	public static int [][] mult(int [][]a, int [][]b){
		if (a.length < b.length && a[0].length < b[0].length){
			c = new int [a.length][a[0].length];
			num = b.length;
		}
		else if (a.length < b.length && a[0].length > b[0].length){
			c = new int [a.length][b[0].length];
			num = b.length;
		}
		else if (a.length > b.length && a[0].length < b[0].length){
			c = new int [b.length][a[0].length];
			num = a.length;
		}
		else {
			c = new int [b.length][b[0].length];
			num = a.length;
		}
		for (int row = 0; row < c.length; row++){
			for (int col = 0; col < c[row].length; col++){
				for (int n = 0; n < num; n++){
					c[row][col] += a[row][n] * b[n][col];
				}
			}
		}
		return c;
	}
}
