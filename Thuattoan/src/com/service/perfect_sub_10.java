/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

/**
 *
 * @author Ukyo
 */
public class perfect_sub_10 {
    public static void main(String[] args) {
        int input = 3523014;
        int input1 = 4103253;
        int input2 = -91919193;
        int input3 = 7;
        System.out.println(checkPerfect_sub_10(input2));
    }

    private static boolean checkPerfect_sub_10(int input) {
        if(input == 0) return false;
        input = Math.abs(input);
        int[] eachnumber = new int[50];
        int length = 0;
        while(input>=1){
            eachnumber[length] = input%10;
            input/=10;
            length++;
        }
        for (int i = 0; i < length;) {
            int k,j = 0;
            int sum = eachnumber[i];
            for(j = i +1; j<length ; j++){
                if (sum+eachnumber[j]>10) {
                    break;
                }
                sum+=eachnumber[j];
            }
            for(k = i-1;k>=0;k--){
                if (sum+eachnumber[k]>10) {
                    break;
                }
                sum+=eachnumber[k];
            }
            if (sum!=10) {
                return false;
            }
            i = j;
        }
        return true;
    }
}
