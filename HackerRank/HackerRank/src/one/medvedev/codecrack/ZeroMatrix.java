package one.medvedev.codecrack;

public class ZeroMatrix {

	public static void main(String[] args) 
	{
		ZeroMatrix zm = new ZeroMatrix();
		int[][] matrix = {{1, 0, 1, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
		zm.doZero(matrix);
	}
	
	private void doZero(int[][] matrix)
	{
		int[] pos = new int[matrix.length + matrix[0].length];
		int x = 0, y = 0;
		for (int i = 0; i < matrix.length; i++)
		{
			for (int k = 0; k < matrix[0].length; k++)
			{
				if (matrix[i][k] == 0)
				{
					 matrix[i][0] = 0;
					 matrix[k][0] = 0;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++)
		{
			if (matrix[i][0] == 0)
			{
				for (int k = 0; k < matrix[0].length; k++)
				{
					matrix[i][k] = 0;
				}
			}
		}
	}
}
