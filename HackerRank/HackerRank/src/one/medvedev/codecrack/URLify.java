package one.medvedev.codecrack;

public class URLify {

	public static void main(String[] args) 
	{
		URLify u = new URLify();
		System.out.println(u.urlify(new char[]{'T', 'h', 'i', 's', ' ', 'I', 's', ' ', 'S', 'p', 'a', 'r', 't', 'a', ' ', ' ', ' ', ' '}));
	}
	
	public String urlify(char[] cArr)
	{
		System.out.println(cArr);
		int k = cArr.length - 1;
		for (int i = cArr.length - 1; i > -1; i--)
		{
				char c = cArr[i];
				if (c == ' ')
				{
					if (k < cArr.length -1)
					{
					cArr[k--] = '0';
					cArr[k--] = '2';
					cArr[k--] = '%';
					}
				}
				else
				{
					cArr[k--] = c;
				}
		}
		
		return new String(cArr);
	}
}
