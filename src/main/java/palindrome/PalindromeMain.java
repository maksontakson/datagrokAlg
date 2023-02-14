package palindrome;

import java.util.HashSet;
import java.util.Set;

public class PalindromeMain {
  public static void main(String[] args) {
    System.out.println(canPermutePalindrome("ivicc"));
    System.out.println(canPermutePalindrome("civic"));
  }
  public static boolean canPermutePalindrome(String s) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      if (!set.add(s.charAt(i))) {
        set.remove(s.charAt(i));
      }
    }

    return set.size() <= 1;
  }
}
