import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("hello, 5");
  }

  public static void printNTimes(String word, int N)
  {
    for (int i = 0; i < word.length(); i++)
    {
      String letter = word.substring(i, +1);
      for (int j = 0; j < N; j++)
      {
        System.out.print(letter);
      }
      System.out.println();
    }
  }

  public static void printNums()
  {
    // code solution here
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
