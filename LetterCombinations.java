package leetcodeAsseement;


	import java.util.*;

	public class LetterCombinations {
	    static final String[] KEYPAD = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	    public static List<String> letterCombinations(String digits) {
	        List<String> result = new ArrayList<>();
	        if (digits.isEmpty()) return result;
	        backtrack(result, digits, 0, new StringBuilder());
	        return result;
	    }

	    private static void backtrack(List<String> res, String d, int i, StringBuilder sb) {
	        if (i == d.length()) { res.add(sb.toString()); return; }
	        for (char c : KEYPAD[d.charAt(i) - '0'].toCharArray()) {
	            backtrack(res, d, i + 1, sb.append(c));
	            sb.setLength(sb.length() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(letterCombinations("23"));
	    }
	}

