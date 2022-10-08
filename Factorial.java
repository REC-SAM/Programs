package Programs;

import java.util.*;

public static class Factorial {
  
  // I don't know why it not compliing
  public int fact ( int n ) {
    if( n < 2 )
      return n;
    return n*fact(n-1);
  }
  
  public static void main ( String [] args ) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: " );
    int n = in.nextInt();
    System.out.println("Answer: " + fact(n));
  }
}
