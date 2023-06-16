package algorithm;
public class Palindrome {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String word = "mum";
        System.out.println(isPalindrome(word));  // Output: true

//        word = "java";
//        System.out.println(isPalindrome(word));  // Output: false
    }
}
