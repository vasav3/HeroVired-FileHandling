/*https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?isFullScreen=true*/


import java.util.*;

public class TryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    try{
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(x/y);
    }
    catch(ArithmeticException e1)
    {
        System.out.println("java.lang.ArithmeticException: / by zero");
    }
    catch(InputMismatchException e2)
    {
        System.out.println("java.util.InputMismatchException");
    }
        }
    }
