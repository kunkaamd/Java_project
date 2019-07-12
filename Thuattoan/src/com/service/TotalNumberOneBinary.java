package com.service;

/*
    Given a positive integer k, calculate the total number of 1s in the binary representations of all the numbers from 1 to k, inclusive.

    Example

    For k = 5, the output should be
    totalOnes(k) = 7.

        110 = 12 => 1
        210 = 102 => 1
        310 = 112 => 2
        410 = 1002 => 1
        510 = 1012 => 2

    Thus, the answer is 1 + 1 + 2 + 1 + 2 = 7.
*/
/**
 *
 * @author LOC
 * 1 - 1
 * 2 - 2
 * 4 - 5
 * 8 - 13
 * 16 - 33
 * 32 - 81
 * 64 - 193 = 81*2+32-1
 * 
 * ---99 - 316 = 193+88+35
 * 
 */
//đ
public class TotalNumberOneBinary {
    public static void main(String[] args) {
        int k = 99;
        long total = 0;
        int i = 0;
        int tempk = k;
        while(k!=0){
            long [] arraylong = getSum(k, 1);
            total +=arraylong[0]+k-arraylong[1];
            
            k=(int) (k-arraylong[1]);
        }
        System.out.println(total);
    }
    private static long[] getSum(int k,int i){
        long sum = 1;
        while (i*2<=k) {
            i*=2;
            sum = sum*2+i/2-1;
        }
        long[] array = {sum,i};
        return array;
    }
}
