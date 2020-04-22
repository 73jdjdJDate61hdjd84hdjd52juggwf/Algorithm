package com.atguigu;

import java.util.Scanner;

public class gouwudan {
    public static int getmax(int[] j, int[] p, int[] q, int m, int n) {
        int[][] a = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int l = 1; l <= n; l++) {
                if (q[i - 1] == 0) {
                    if (p[i - 1] <= l) {
                        a[i][l] = Math.max(a[i - 1][l], a[i - 1][l - p[i - 1]] + j[i - 1]);
                    }
                }
                if (p[i - 1] > 0) {
                    if (p[i - 1] + p[q[i - 1]] <= l) {
                        a[i][l] = Math.max(a[i - 1][l], a[i - 1][l - p[i - 1]] + j[i - 1]);
                    }
                }
            }
        }
        return a[m][n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int N = s.nextInt();//总钱数N
            int m = s.nextInt();//商品个数
            int[] p = new int[m];//商品价格
            int[] v = new int[m];//重要度
            int[] q = new int[m];//主or附
            int[] j = new int[m];//v*p
            for (int i = 0; i < m; i++) {
                p[i] = s.nextInt();
                v[i] = s.nextInt();
                q[i] = s.nextInt();
                j[i] = v[i] * p[i];
            }
            System.out.println(getmax(j, p, q, m, N));
        }
    }
}
