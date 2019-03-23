package test;
/**
 * 复杂度o(v^2)
 * 邻接表加优先队列优化到o(e*logv)
 * 不能有负边
 * @author Administrator
 *
 */
public class _最短距离_dijkstra {
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
	public static void main(String[] args) {
		used[0]=true;
		dijkstra(0);
		System.out.println(d[6]);
		for (int i = 0; i < pre.length; i++) {
			System.out.print(pre[i]+" ");
		}
	}
	static void dijkstra(int s)
	{
		for (int i = 0; i < v; i++) {
			d[i]=cost[s][i];
		}
		while (true) {
			int id=-1;
			for (int i = 0; i < v; i++) {//找出距离最短的点
				if (!used[i]&&(id==-1||d[i]<d[id])) {
					id=i;
				}
			}
			if (id==-1) {
				break;
			}
			used[id]=true;
			for (int i = 0; i < v; i++) {
//				d[i]=Math.min(d[i], d[id]+cost[id][i]);
				if (d[i]>d[id]+cost[id][i]) {
					d[i]=d[id]+cost[id][i];
					pre[i]=id;
				}
			}
			
		}
	}
}















