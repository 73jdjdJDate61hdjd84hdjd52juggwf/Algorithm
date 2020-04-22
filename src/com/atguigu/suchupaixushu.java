package com.atguigu;

import java.util.Scanner;

public class suchupaixushu {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[1000];

        while (scanner.hasNextInt()){
            for (int i=0;i<1000;i++){
                ints[i]=0;
            }

            int num = scanner.nextInt();
            for (int j=0;j<num;j++){
                int n = scanner.nextInt();
                ints[n] =n;

            }
            for (int m=0;m<1000;m++){
                if (ints[m]==0){

                }else {
                    System.out.println(ints[m]);
                }
            }
        }
    }
}
