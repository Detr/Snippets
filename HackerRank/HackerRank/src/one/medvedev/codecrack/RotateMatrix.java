package one.medvedev.codecrack;

public class RotateMatrix {

	public static void main(String[] args) 
	{
		RotateMatrix rm = new RotateMatrix();
		//int[][] img = {{1, 2, 3, 13}, {4, 5, 6, 14}, {7, 8, 9, 15}, {10, 11, 12, 16}};
		int[][] img = {{1, 2}, {4, 5}};
		rm.rotate(img);
	}
	
	private void rotate(int[][] img)
	{
		int[][] newImg = new int[img[0].length][img.length];
		for (int j = 0; j < img[0].length; j++)
		{
			for (int i = 0; i < img.length; i++)
			{
				newImg[j][i] = img[img.length - 1 - i][j];
			}
		}
	}

}
