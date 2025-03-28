package leetcodes;
import java.util.Scanner;


	public class palindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number or string: ");
	        String input = sc.nextLine();
	        sc.close();

	        int start = 0, end = input.length() - 1;
	        boolean isPalindrome = true;

	        while (start < end) {
	            if (input.charAt(start++) != input.charAt(end--)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
	    }
	}
