package leetcodes;

	import java.util.Scanner;

	public class leetcode {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter an integer: ");
	        int num = sc.nextInt();
	        sc.close();

	        int reversed = 0;
	        while (num != 0) {
	            reversed = reversed * 10 + num % 10;
	            num /= 10;
	        }
	        System.out.println("Reversed integer: " + reversed);
	    }
	}

