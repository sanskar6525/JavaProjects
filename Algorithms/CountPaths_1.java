package Algorithms;

/*Suppose there is a maze of nxn, then count the number of paths possible to reach the bottom right block when
one can either go right or down only.*/

public class CountPaths_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(3,3));

	}
	public static int count(int r,int c)
	{
		if(r==1||c==1)
			return 1;
		
		int right=count(r,c-1);
		int left=count(r-1,c);
		
		return right+left;
	}

}
