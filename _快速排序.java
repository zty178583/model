package test;
/**
 * 快速排序
 * @author Administrator
 *
 */
public class _快速排序 {
	static int[] num= {3,6,2,7,4,2,8,5,0,8,4};
	public static void main(String[] args) {
		fastSort(num,0,10);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
	}
	private static void fastSort(int[]num,int low,int high)
	{
		if (low<high) {
			int pos = f(num,low,high);
			fastSort(num,low,pos-1);
			fastSort(num, pos+1, high);
		}
	}
	private static int f(int[] n,int low,int high) {
		int c=n[low];
		int i=low,j=high;
		while(i<j)
		{
			while(n[j]>c&&i<j)j--;
			n[i]=n[j];
			while(n[i]<=c&&i<j)i++;
			n[j]=n[i];
		}
		n[i]=c;

		return i;
		
	}
}
