/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.util.Scanner;

/**
 *
 * @author LOC
 */
public class BanBe {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a,b,s1=1,s2=1;
        System.out.println("nhap a");
        a=scanner.nextInt();
        System.out.println("nhap b");
        b=scanner.nextInt();
        for (int i = 2; i <= a/2; i++) {
            if (a%i==0) {
                s1=s1+i;
            }
        }
        for (int i = 2; i <= b/2; i++) {
            if (b%i==0) {
                s2=s2+i;
            }
        }
        if (s1==b && s2==a) {
            System.out.println("la so hoan hao");
        }else{
            System.out.println("khong phai so hoan hao");
        }
    }
}
