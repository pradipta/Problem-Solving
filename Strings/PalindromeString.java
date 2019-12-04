//Interviewbit: https://www.interviewbit.com/problems/palindrome-string/

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.


public class PalindromeString {
    public int isPalindrome(String A) {
        int low = 0;
        A=A.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int high = A.length();
        while(high>=low) {
            if (Character.toLowerCase(A.charAt(low)) != Character.toLowerCase(A.charAt(high))){
                return 0;
            }
            high--;
            low++;
        }
        return 1;
    }
}
