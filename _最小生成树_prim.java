package test;
/**
 * 复杂度o(v^2)
 * 用堆优化d数组可为o(e*logv)
 * @author Administrator
 *
 */
public class _最小生成树_prim {
	static int []pre=new int[7];
	static int max=Integer.MAX_VALUE/10;
	static int[][]cost= {
			{0,2,5,max,max,max,max},
			{2,0,4,6,10,max,max},
			{5,4,0,2,max,max,max},
			{max,6,2,0,max,1,max},
			{max,10,max,max,0,3,5},
			{max,max,max,1,3,0,9},
			{max,max,max,max,5,9,0}
	};
	static int v=7;
	static int d[]=new int[v];
	static boolean[] used=new boolean[v];
	private static int res=0;
	public static void main(String[] args) {
		prim();
		System.out.println(res);
	}
	static void prim() {
		used[0]=true;
		for (int i = 0; i < cost.length; i++) {
			d[i]=cost[0][i];
		}
		
		while (true) {
			int id=-1;//找到距离最近的点	
			for (int i = 0; i < v; i++) {
				if (!used[i]&&(id==-1||d[id]>d[i])) {
					id=i;
				}
			}
			if (id==-1) {
				break;
			}
			used[id]=true;//加入到数
			res+=d[id];
			for (int i = 0; i < v; i++) {
				if(d[i]>cost[id][i])
					d[i]=cost[id][i];
			}
			
		}
		
	}
}
