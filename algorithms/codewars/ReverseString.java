package algorithms.codewars;

public class ReverseString {
  public static String solution(String str) {
    String[] splString = str.split("(?!^)");
    String reversed = "";

    for (String letter : splString) {
      reversed = letter + reversed;
    }

    return reversed;
  }
}