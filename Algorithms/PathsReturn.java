package Algorithms;

/*Suppose there is a maze of nxn, then return all the paths possible to reach the bottom right block.*/

public class PathsReturn {
	public static void print(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//paths1("",3,3);
		System.out.println("\n\n");
		//paths2("",3,3);
		String[][] maze= {
				{"true","true","true"},
				{"true","true","true"},
				{"true","true","true"}
		};
		//System.out.println(maze[0][0]);
		int[][] path=new int[3][3];
		path[0][0]=1;
		paths3("",maze,0,0,1,path);
	}
	
	public static void paths1(String s,int r, int c)
	{ /* when one can either go right or down only */
		if(r==1 && c==1)
		{
			System.out.println(s+" in "+s.length()+" steps");
			return;
		}
		
		if(r==1)
			paths1(s+'R',r,c-1);
		else if(c==1)
			paths1(s+'D',r-1,c);
		else
		{
			paths1(s+'R',r,c-1);
			paths1(s+'D',r-1,c);
		}
	}
	
	public static void paths2(String s,int r, int c)
	{/* when one can either go right or down or slant as well*/
		if(r==1 && c==1)
		{
			System.out.println(s+" in "+s.length()+" steps");
			return;
		}
		if(r==1)
			paths2(s+'R',r,c-1);
		else if(c==1)
			paths2(s+'D',r-1,c);
		else
		{
			paths2(s+'R',r,c-1);
			paths2(s+'S',r-1,c-1);
			paths2(s+'D',r-1,c);
		}
		
		
	}

	public static void paths3(String s,String[][] m,int r,int c,int level,int[][]a)
	{/* when one can either go in all directions including up,down,left,right*/
		if(r==m.length-1 && c==m[0].length-1)
		{
			a[r][c]=level;
			System.out.println(s);
			print(a);
			return;
		}
		
		if(!m[r][c].equals("true"))
			return; 
		m[r][c]="false";
		a[r][c]=level;
		
		if(r<m.length-1)
			paths3(s+'D',m,r+1,c,level+1,a);
		
		if(c<m[0].length-1)
			paths3(s+'R',m,r,c+1,level+1,a);
		
		if(r>0)
			paths3(s+'U',m,r-1,c,level+1,a);
		if(c>0)
			paths3(s+'L',m,r,c-1,level+1,a);
			
		a[r][c]=0;	
		m[r][c]="true";
		
		
	}
}
