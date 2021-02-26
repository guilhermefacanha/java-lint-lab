package main;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hi, type the action you want to perform:");
    System.out.println("1-Login");
    System.out.println("2-Calc Sum");
    System.out.println("3-Calc Sub");
    System.out.println("4-String compare");

    String action = getInput();
    int actionInt = Integer.parseInt(action);
    switch (actionInt) {
      case 1:
        System.out.println("Type secret: ");
        String secret = getInput();
        if (StringUtil.isAdmin(secret)) System.out.println("That's right you can login in.");
        break;
      case 2:
        System.out.println("Type the numbers separated by white space. e.g. '2 3 5'");
        String numbers = getInput();
        String[] n = numbers.split(" ");
        int[] numbersInt = new int[n.length];
        for (int i = 0; i < n.length; i++) {
          numbersInt[i] = Integer.parseInt(n[i]);
        }
        System.out.println("Your total is: " + CalcUtil.sum(numbersInt));
        break;

      default:
        break;
    }
  }

  private static String getInput() {
    return new Scanner(System.in).next();
  }
}
