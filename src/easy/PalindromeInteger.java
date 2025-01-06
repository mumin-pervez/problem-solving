package easy;

public class PalindromeInteger {

  public boolean isPalindrome(int x) {
    // Step 1: Handle negatives and trailing zeros (except 0 itself)
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }

    // Step 2: Reverse half of the digits
    int reversedHalf = 0;
    while (x > reversedHalf) {
      // Add the last digit of x to reversedHalf
      reversedHalf = reversedHalf * 10 + x % 10;
      // Remove the last digit from x
      x /= 10;
    }

    // Step 3: Check if the number is a palindrome
    // (For odd-length numbers, ignore the middle digit in reversedHalf)
    return x == reversedHalf || x == reversedHalf / 10;
  }


  public static void main(String[] args) {
    PalindromeInteger obj = new PalindromeInteger();
    System.out.println(obj.isPalindrome(121));
  }
}
