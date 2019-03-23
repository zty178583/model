package test;

/**
 * 求n个数的全排列，递归深度运行速度测试
 * @author Administrator
 *
 */
public class _全排列 {
	static int count=0;//计数循环次数（递归相当于循环）
	static int n=3;//1s内10是极限（前提不加输出）！
	static int perm[]=new int[n+1];
	static boolean used[]=new boolean[n+1];
	public static void main(String[] args) {
		new _全排列().permutation(0);
		System.out.println(count);
	}
	private void permutation(int pos) {
		if (pos==n) {
			for (int i = 0; i < perm.length; i++) {
				System.out.print(perm[i]);
			}
			++count;
			
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			if(!used[i])
			{
				perm[pos]=i;
				used[i]=true;
				permutation(pos+1);
				used[i]=false;
			}
		}
	}
}
