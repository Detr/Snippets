package one.medvedev.codecrack;

public class OneAway {

	public static void main(String[] args) {
		OneAway oa = new OneAway();
		System.out.println(oa.oneAway("pale", "ple"));
		System.out.println(oa.oneAway("pales", "pale"));
		System.out.println(oa.oneAway("pale", "bales"));
		System.out.println(oa.oneAway("pale", "bake"));
	}

	public boolean oneAway(String str1, String str2) {
		if (Math.abs(str1.length() - str2.length()) > 1) {
			return false;
		}
		int i = 0, k = 0;
		boolean run = true;
		int diff = 0;
		while (run) {
			if (i < str1.length() && k < str2.length()) 
			{
				if (str1.charAt(i) != str2.charAt(k)) 
				{
					diff++;
					if (i + 1 < str1.length() && str1.charAt(i + 1) == str2.charAt(k)) 
					{
						i++;
					}
					if (k + 1 < str2.length() && str2.charAt(i) == str1.charAt(i)) 
					{
						k++;
					}
				}
				i = i == str1.length() ? i - 1 : i + 1;
				k = k == str2.length() ? k - 1 : k + 1;
			}
			else
			{
				if (i == k && (k < str2.length() || i < str1.length())) diff++;
				run = false;
			}
			if (diff > 1) 
			{
				return false;
			}
		}
		if (diff > 1) 
		{
			return false;
		}
		return true;
	}
}
