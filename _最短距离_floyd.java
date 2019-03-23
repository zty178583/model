package test;
/**
 * 任意两点距离
 * 复杂度o(v^3)
 * 可处理负边
 * d[i][i]为负数有负圈
 * @author Administrator
 *
 */
public class _最短距离_floyd {
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
	static int[][]d=new int[v][v];
	public static void main(String[] args) {
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				d[i][j]=cost[i][j];
			}
		}
		floyd();
		System.out.println(d[6][0]);
	}
	
	static void floyd() {
		for (int i = 0; i < v; i++) {//起点
			for (int j = 0; j < v; j++) {//终点
				for (int k = 0; k < v; k++) {//经过
					int min=Math.min(d[i][j], d[i][k]+d[k][j]);
					d[i][j]=min;
					d[j][i]=min;
				}
			}
		}
	}
	
}
