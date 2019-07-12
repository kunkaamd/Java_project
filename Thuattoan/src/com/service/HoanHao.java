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
public class HoanHao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,s=1;
        
        System.out.println("nhap so kiem tra");
        n = scanner.nextInt();
        
        for (int i = 2; i <= n/2; i++) {
            if (n%i==0){
                s=s+i;
            }
        }
        if (s==n) {
            System.out.println("la so hoan hao");
        }
        else{
            System.out.println("khong phai");
        }
    }
}
