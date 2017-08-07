import java.util.Arrays;

public class Finormic {

	public static void main(String[] args) {
		String s = "back";
		String t = "ad";
		System.out.println(searchAnagrams(s, t));
	}
	
	/**
	 * Sorts a given string
	 * @param string the string to sort
	 * @return sorted string
	 */
	private static String sortedString(String string) {
		char[] cArr = string.toCharArray();
		Arrays.sort(cArr);
		return new String(cArr);
	}

	/**
	 * Finds if any anagram of 't' is presents in string 's'.  
	 * @param s the string to search in
	 * @param t the string to whose anagrams have to be searched
	 * @return true, if anagram is found in the string
	 */
	private static boolean searchAnagrams(String s, String t) {
		int stringLen = s.length();
		int anagramLen = t.length();
		
		String sortedAnagram = sortedString(t);
		for (int i = 0; i <= (stringLen - anagramLen); i++) {
			String subString = s.substring(i, i + anagramLen);
			String sortedSubString = sortedString(subString);
			
			if (sortedAnagram.equals(sortedSubString))
				return true;
		}
		
		return false;
	}
}