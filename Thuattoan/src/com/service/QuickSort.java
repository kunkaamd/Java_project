/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thai_Loc
 */
public class QuickSort {
    private static int A[];
    private static void swap(int index1,int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
    private static void Qsort(int first,int last){
        if (first<last) {
            int key = first;
            int i = first;
            int j = last;
            i++;
            while(i<=j){
                if(A[i]<=A[key]){
                    i++;
                }else{
                    if (A[j]>A[key]) {
                        j--;
                    }else{
                        swap(i, j);
                    }
                }
            }
            if (A[key]!=A[j]) {
                swap(key, j);
            }
            System.out.print(first+"--"+last+"---");
            for (int k = first; k <= last; k++) {
                int l = A[k];
                System.out.print(l);
            }
            System.out.println("");
            Qsort(first,j-1);
            Qsort(j+1, last);
            
        }
    }
    public static void main(String[] args) {
        A = new int[255];
        for (int i=0; i<255; i++){
            A[i] = (int)(Math.random()*1000 + 1);
        }
        Qsort(0, 254);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+"-");
        }
    }
}
