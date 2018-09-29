package one.medvedev.codecrack;

public class UniqueString {

	public static void main(String[] args) 
	{
		UniqueString us = new UniqueString();
		String str = "asdaf";//System.console().readLine();
		if (str != null && str.length() > 0)
		{
			System.out.println(us.isUnique(str));
		}
	}
	
	public boolean isUnique(String str)
	{
		boolean[] abc = new boolean[26];
		int a = (int) 'a';
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			int charIdx = ((int) c) - a;
			if (!abc[charIdx])
			{
				abc[charIdx] = true;
			}
			else
			{
				return false;
			}
		}
		return true;
	}

}
