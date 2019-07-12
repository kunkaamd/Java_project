package com.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LOC
 */
public class BinarySearch {
    static int binarySearch(int[] A,int first,int last,int find){
        int mid = (first+last)/2;
        if(find==A[mid]){
            return mid;
        }
        if(last<=first){
            return -1;
        }
        if(find>A[mid]){
            return binarySearch(A, mid+1, last, find);
        }else{
            return binarySearch(A, first, mid-1, find);
        }
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,23,26,38,43,49}, 0, 13, 1));
    }
}
