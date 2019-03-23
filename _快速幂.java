package test;

import test._矩阵乘.Matrix;

public class _快速幂 {
	public static void main(String[] args) {
		System.out.println(fastPow(3, 3));
	}
	static long fastPow(int a,int m) {
		long base=a;
		long res=1;
		while (m>0) {
			if((m&1)==1)
				res*=base;
			base*=base;
			m>>=1;
		}
		return res;
	}
	static Matrix fastPow(Matrix a,int m) {
		Matrix base=a;
		Matrix res=_矩阵乘.getUnitM(a.m, a.n);
		while (m>0) {
			if((m&1)==1)
				res=_矩阵乘.matrixMul(res, base);
			base=_矩阵乘.matrixMul(base, base);
			m>>=1;
		}
		return res;
	}
}
