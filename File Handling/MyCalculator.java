/*https://www.hackerrank.com/challenges/java-exception-handling/problem?isFullScreen=true*/

import java.io.*;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
public long power(int n, int p) throws Exception{
        if(n < 0 || p < 0){ throw new Exception("n or p should not be negative.");}
        if(n == 0 && p == 0){ throw new Exception("n and p should not be zero.");}
        long exp = 1;
        for(int i =0; i < p; i++){
            exp *= n;
        }
        return exp;
    }
}

