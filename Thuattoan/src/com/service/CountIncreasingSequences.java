/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author LOC
 */
/**
 *
    Given integers n and k, find the number of strictly increasing sequences of length n consisting of positive integers not exceeding k
    Example

    For n = 2 and k = 3, the output should be
    countIncreasingSequences(n, k) = 3.
    They are: [1, 2], [1, 3] and [2, 3].
    * 
    * 
    * 
    ______________SOLUTION.PY3___________________
    * 
    * Tổ hợp chập k của n phần tử là số các tập hợp con k phần tử của một tập n phần tử cho trước
    * =>result=n!/k!(n-k)!
    * 
    * 
    def countIncreasingSequences(n, k):
    def giaithua(m):
        res =1
        for x in range(1,m+1):
            res*=x
        return res
    if n==1:
        return k
    else:
        return giaithua(k)//giaithua(k-n)//giaithua(n)
 */

public class CountIncreasingSequences {
}
