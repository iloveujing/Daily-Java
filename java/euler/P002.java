package com.zf.java.euler;
/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class P002
{
    public static void main( String[] args )
    {
        P002 solver = new P002();
        System.out.println(4&1);
        System.out.println(solver.solve1(8));
        System.out.println(solver.solve(8));
        System.out.println(solver.solve1(4000000));
    }

    private long solve(long input) {
        long result = 0;
        long kMinus = 0;
        long k = 1;
        long kPlus = 0;
        do {
            kPlus = k + kMinus;
            if (kPlus % 2 == 0 && kPlus < input) {
                result += kPlus;
            }
            kMinus = k;
            k = kPlus;
        } while (kPlus < input);
        return result;
    }

    public long solve1(long input) {
        long result = 0;
        long kMinus = 0;
        long k = 1;
        long kPlus = 1;
        while (kPlus < input) {
            kPlus = k + kMinus;
            if ((kPlus & 1) == 0 && kPlus < input){
                result += kPlus;
            }
            kMinus = k;
            k = kPlus;
        }
        return result;
    }
}
