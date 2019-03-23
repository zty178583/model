package test;
/**
 * 并查集
 * @author Administrator
 *
 */
public class _并查集 {
	static int [] par=new int[10];
	static int []rank=new int[10];
	public static void main(String[] args) {
		for (int i = 0; i < par.length; i++) {
			par[i]=i;
			rank[i]=0;
		}
		
		_并查集 test7 = new _并查集();
		test7.unit(0, 1);
		System.out.println(test7.same(0, 1));
		test7.unit(1, 5);
		System.out.println(test7.same(0, 5));
	}
	private void unit(int i,int j) {
		if(findPar(i)==findPar(j))
			return;
		if (rank[i]<rank[j]) {
			par[i]=j;
		}else {
			par[j]=i;
			if (rank[j]==rank[i]) {
				rank[i]++;
			}
		}
	}
	private int findPar(int i) {
		if(par[i]==i)return i;
		
		return par[i]=findPar(par[i]);
	}
	private boolean same(int i,int j) {
		return findPar(i)==findPar(j);
	}
}
