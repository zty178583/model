package test;
/**
 * 可有负边，不能有负圈
 * @author Administrator
 *
 */
public class _最短路径_ford {
	static int []pre=new int[7];
	static class Edge{
		int from,to,cost;

		public Edge(int from, int to, int cost) {
			super();
			this.from = from;
			this.to = to;
			this.cost = cost;
		}
		
	}
	private static final int INF = Integer.MAX_VALUE;
	static Edge[]edges= {new Edge(0,1,2),new Edge(1,0,2),new Edge(0,2,5),new Edge(2,0,5),new Edge(1,2,4),new Edge(2,1,4),new Edge(1,3,6),new Edge(3,1,6),new Edge(1,4,10),new Edge(4,1,10),
			new Edge(2,3,2),new Edge(3,2,2),new Edge(3,5,1),new Edge(5,3,1),new Edge(4,5,3),new Edge(5,4,3),new Edge(4,6,5),new Edge(6,4,5),new Edge(5,6,9),new Edge(6,5,9)};
	static int v=7;
	static int e=20;
	static int d[]=new int[7];
	public static void main(String[] args) {
		shortest_path(0);
		System.out.println(d[6]);
		for (int i = 0; i < pre.length; i++) {
			System.out.print(pre[i]);
		}
	}
	static void shortest_path(int s)
	{
		for (int i = 0; i < v; i++) {
			d[i]=INF;
		}
		d[s]=0;
		while(true)
		{
			boolean update=false;
			for (int i = 0; i < e; i++) {
				Edge edge=edges[i];
				if (d[edge.from]!=INF&&d[edge.to]>d[edge.from]+edge.cost) {
					d[edge.to]=d[edge.from]+edge.cost;
					update=true;
					pre[edge.to]=edge.from;
				}
			}
			if (!update) {
				break;
			}
		}
	}
}










