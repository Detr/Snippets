package one.medvedev.codecrack;

import java.util.HashMap;

public class PalindromePermutation {

	public static void main(String[] args) 
	{
		PalindromePermutation pp = new PalindromePermutation();
		System.out.println(pp.getResult("tcoactoa"));
	}

	public String getResult(String str)
	{
		HashMap<Character, Integer> chars = new HashMap<>();
		for (int i = 0; i < str.length(); i++)
		{
			Character c = str.charAt(i);
			if (chars.containsKey(c))
			{
				chars.put(c, chars.get(c) + 1);
			}
			else
			{
				chars.put(c, 1);
			}
		}
		char[] result = new char[str.length()];
		char pivot = 0;
		int i = 0;
		for (Character c : chars.keySet())
		{
			if (chars.get(c) % 2 != 0)
			{
				if (chars.get(c) == 1 && pivot == 0)
				{
					pivot = c;
					result[(int)(str.length() / 2)] = c;
					continue;
				}
				else
				{
					return Boolean.FALSE.toString();
				}
			}
			else
			{
				result[i] = c;
				result[str.length() - 1 - i] = c;
				i++;
			}
		}
		
		return Boolean.TRUE.toString() + "(" + String.copyValueOf(result) + ")";
	}
}
