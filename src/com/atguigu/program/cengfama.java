package com.atguigu.program;

import java.util.Scanner;

public class cengfama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int n = Integer.parseInt(in.nextLine()); // n 种砝码
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            System.out.println(getNums(n, str1, str2));
        }
        in.close();
    }

    private static int getNums(int n, String s1, String s2) {
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        int[] m = new int[n];
        int[] x = new int[n];
        int sum = 0; // 总的重量
        for (int i = 0; i < n; i++) {
            m[i] = Integer.valueOf(s1Arr[i]); // 每种砝码的重量
            x[i] = Integer.valueOf(s2Arr[i]); // 每种砝码的数量
            sum += x[i] * m[i];
        }
        boolean[] temp = new boolean[sum+1];//能测的质量种类，最多是：总质量+1
        temp[0] = true;//质量为0，也为true
        temp[sum] = true;//质量满了也为true
        for (int i = 0; i < n; i++) {//砝码的种类数
            for (int j = 0; j < x[i]; j++) {//每种砝码对应的个数
                for (int k = sum; k >= m[i]; k--) {//总重量往下减
                    //假设k-m[i]为1，即质量为1的值，已经存在temp数组
                    //temp[k-m[i]]为true,当前m[i]代表的当前质量，在1的基础上累加是可以的，即累加后的值为k
                    //所以可以设置temp[k]=true,后面依次递归
                    if (temp[k - m[i]])//递归思想的应用
                        temp[k] = true;//若质量相同的会被覆盖，所以不用额外处理相同的质量
                }
            }
        }
        int count = 0;
        for (int i = 0; i <= sum; i++) {
            if (temp[i])
                count++;
        }//找到temp[]为true的，这是可以被称出来的；
        return count;
    }
}
