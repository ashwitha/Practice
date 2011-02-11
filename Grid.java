/*Starting in the top left corner of a 2×2 grid, 
there are 6 routes (without backtracking) to the bottom right corner.
How many routes are there through a 15×15 grid?
*/
		
		
public class Grid  
{  
	public long progress(int x, int y)
	{
		int i = 0;

		int gridSize=10;
		if (x < gridSize)
			i += progress(x + 1, y);
		if (y < gridSize)
			i += progress(x, y + 1);

		if (x == gridSize && y == gridSize)
			return 1;

		return i;
	}
	public static void main(String args[])
	{
     Grid g=new Grid();
     long result=g.progress(0,0);
     System.out.println(result);
	}
}