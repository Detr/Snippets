package one.medvedev.codecrack;

public class StringCompression {

	public static void main(String[] args) 
	{
		StringCompression sc = new StringCompression();
		System.out.println(sc.compress("aaaabbbbdfdfddddddeeeeeeee"));
	}
	
	public String compress(String str)
	{
		char prev = 10000;
		int ci = 0;
		boolean original = true;
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if (i > 0 && prev != c)
			{
				res.append(prev);
				res.append(ci);
				if (ci > 1) original = false;
				ci = 0;
			}
			ci++;
			prev = c;
		}
		res.append(prev);
		res.append(ci);
		
		return original ? str : res.toString();
	}

}
