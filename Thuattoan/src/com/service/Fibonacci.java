/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;



/**
 *
 * @author LOC
 */
public class Fibonacci {
    private static int fibonaci(int n){
        if (n==0) {
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonaci(n-1)+fibonaci(n-2);
    }
    public static void main(String[] args) {
        int a = fibonaci(12);
        System.out.println(a);
    }
}
