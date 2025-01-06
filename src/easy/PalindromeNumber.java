package easy;

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your number : ");
    int num = input.nextInt();
    int sum = 0;
    int i = num;
    while (i > 0) {
      int d = i % 10;
      sum = sum * 10 + d;
      i = i / 10;
    }
    if (num == sum) {
      System.out.println("Your number " + num + " is Palindrome");
    } else {
      System.out.println("Your number " + num + " is Not Palindrome");
    }
  }
}
