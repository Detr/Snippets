package one.medvedev.codecrack;

public class PermutationStrings {

	public static void main(String[] args) 
	{
		PermutationStrings ps = new PermutationStrings();
		System.out.println(ps.isPermutation("abcde", "dcbae"));
	}
	
	public boolean isPermutation(String str1, String str2)
	{
		long abc1 = 0;
		long abc2 = 0;
		int baseChar = 'a';
		if (str1 == null && str2 == null)
		{
			return false;
		}
		if (str1.length() != str2.length())
		{
			return false;
		}
		for (int i = 0; i < str1.length(); i++)
		{
			abc1 |= 1 << str1.charAt(i) - baseChar + 1;
			abc2 |= 1 << str2.charAt(i) - baseChar + 1;
		}
		return abc1 == abc2;
	}
}
