package test;

public class _矩阵乘 {
	static class Matrix{
		int m;
		int n;
		int[][]data;
		public Matrix(int m, int n) {
			super();
			this.m = m;
			this.n = n;
			data=new int[m][n];
		}
		
	}
	//获得单位矩阵
	public static Matrix getUnitM(int m,int n) {
		Matrix matrix = new Matrix(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix.data[i][j]=0;
				if (i==j) {
					matrix.data[i][j]=1;
				}
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		Matrix a = new Matrix(2, 3);
		a.data[0][0]=1;
		a.data[0][1]=2;
		a.data[0][2]=3;
		a.data[1][0]=4;
		a.data[1][1]=5;
		a.data[1][2]=6;
		Matrix b = new Matrix(3, 2);
		b.data[0][0]=1;
		b.data[0][1]=2;
		b.data[1][0]=3;
		b.data[1][1]=4;
		b.data[2][0]=5;
		b.data[2][1]=6;
		Matrix matrixMul = matrixMul(a, b);
		for (int i = 0; i < matrixMul.m; i++) {
			for (int j = 0; j < matrixMul.n; j++) {
				System.out.print(matrixMul.data[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static Matrix matrixMul(Matrix a,Matrix b) {
		if (a.n!=b.m) {
			return null;
		}
		Matrix c = new Matrix(a.m, b.n);
		
		for (int i = 0; i < a.m; i++) {
			for (int j = 0; j < b.n; j++) {
				for (int k = 0; k < a.n; k++) {
					c.data[i][j]+=a.data[i][k]*b.data[k][j];
				}
			}
		}
		
		return c;
		
	}
	
}
