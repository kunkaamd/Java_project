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
public class IntToBinary {
    private static String inttoBinary(int a){
        if (a==0) {
            return "";
        }
        return inttoBinary(a/2)+Integer.toString(a%2);
    }
    public static void main(String[] args) {
        System.out.println(inttoBinary(14));
    }
}
