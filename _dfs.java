package test;
/**
 * 从s走到e 求路径
 * @author Administrator
 *
 */
public class _dfs {
	static boolean[][]flag=new boolean[3][4];
	static char[][]map= {	
							{'*','s','*','*'},
							{'*','.','.','*'},
							{'*','*','.','e'},
						};//深搜地图
	public static void main(String[] args) {
		int i = 0,j = 1;
		String[] path = new String[7];
		dfs(i,j,path,0);//dfs参数 改变的量，和结果相关的量
	}
	private static void dfs(int i, int j, String[] path,int step) {
		path[step]=i+"-"+j;
		flag[i][j]=true;
		if (map[i][j]=='e') {	
			for (int k = 0; k < step+1; k++) {
				System.out.print(path[k]+" ");
			}
			System.out.println();
			return;
		}
			if(i+1<3&&map[i+1][j]!='*'&&!flag[i+1][j])
				dfs(i+1, j, path, step+1);
			if (i-1>-1&&map[i-1][j]!='*'&&!flag[i-1][j])
				dfs(i-1, j, path, step+1);
			if(j+1<4&&map[i][j+1]!='*'&&!flag[i][j+1])
				dfs(i, j+1, path, step+1);
			if (j-1>-1&&map[i][j-1]!='*'&&!flag[i][j-1])
				dfs(i, j-1, path, step+1);
		
		
		
	}
}
