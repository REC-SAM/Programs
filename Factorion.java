package Programs;

import java.util.*;

public class Factorion extends Factorial {
  
  public static boolean isFactorion ( int n ) {
    int sum = 0;
    int m = n;
    while( n > 0 ) {
      sum += fact(n%10);
      n /= 10;
    }
    return ( m == sum );
  }
  
  public static void main ( String [] args ) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = in.nextInt();
    if( isFactorion (n) )
      System.out.println("\n" + n + " is a Factorion Number" );
    else
      System.out.println("\n" + n + " is a not Factorion Number" );
  }
}
