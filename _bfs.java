package test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从s走到e 求路径长度
 * @author Administrator
 *
 */
public class _bfs {
	static class point{
		int x;
		int y;
		public point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	};
	static boolean[][]flag=new boolean[3][4];
	static Queue<point>que=new LinkedList<_bfs.point>();
	static int[][]d=new int[3][4];//到各点长度
	static char[][]map= {	
							{'s','.','*','*'},
							{'*','.','.','*'},
							{'*','*','.','e'},
						};//深搜地图
	public static void main(String[] args) {
		bfs();
		System.out.println(d[2][3]);
	}
	private static void bfs() {
		que.add(new point(0, 0));
		flag[0][0]=true;
		while (!que.isEmpty()) {
			point h = que.poll();
			
			if(h.x+1<3&&map[h.x+1][h.y]!='*'&&!flag[h.x+1][h.y])
			{
				d[h.x+1][h.y]=d[h.x][h.y]+1;
				que.add(new point(h.x+1,h.y));
				flag[h.x+1][h.y]=true;
			}
			if(h.x-1>-1&&map[h.x-1][h.y]!='*'&&!flag[h.x-1][h.y])
			{
				d[h.x-1][h.y]=d[h.x][h.y]+1;
				que.add(new point(h.x-1,h.y));
				flag[h.x-1][h.y]=true;
			}
			if(h.y+1<4&&map[h.x][h.y+1]!='*'&&!flag[h.x][h.y+1])
			{
				d[h.x][h.y+1]=d[h.x][h.y]+1;
				que.add(new point(h.x,h.y+1));
				flag[h.x][h.y+1]=true;
			}
			if(h.y-1>-1&&map[h.x][h.y-1]!='*'&&!flag[h.x][h.y-1])
			{
				d[h.x][h.y-1]=d[h.x][h.y]+1;
				que.add(new point(h.x,h.y-1));
				flag[h.x][h.y-1]=true;
			}
		}
	}
}















