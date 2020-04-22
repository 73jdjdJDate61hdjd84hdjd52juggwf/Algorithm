package com.atguigu.dynamic;

public class MyKnapsackProblem {

    public static void main(String[] args) {

        //物品的重量
        int[] w = {1, 4, 3};
        //物品的的价值
        int[] val = {1500, 3000, 2000};
        //背包的容量
        int m = 4;
        //物品的个数
        int n = w.length;

        //背包中装入第i个物品时，在j重量下的价值
        int[][] v = new int[n + 1][m + 1];
        int[][] path = new int[n + 1][m + 1];
        //把第一行的所有列赋值为0
        for (int i = 0; i < m + 1; i++) {
            v[0][i] = 0;
        }
        //把第一列的所有行赋值为0
        for (int j = 0; j < n + 1; j++) {
            v[j][0] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (w[i - 1] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
//                    v[i][j]=Math.max(v[i-1][j],val[i-1]+v[i-1][j-w[i-1]]);
                    if (v[i - 1][j] > val[i - 1] + v[i - 1][j - w[i - 1]]) {
                        v[i][j] = v[i - 1][j];
                    } else {
                        v[i][j] = val[i - 1] + v[i - 1][j - w[i - 1]];
                        path[i][j] = 1;
                    }

                }
            }
        }


        int i = n; //行的最大下标
        int j = m;  //列的最大下标
        while(i > 0 && j > 0 ) { //从path的最后开始找
            if(path[i][j] == 1) {
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= w[i-1]; //w[i-1]
            }
            i--;
        }

//        for (int i = 1;i < n+1;i++) {
//            for (int j = 1; j < m + 1; j++) {
//                System.out.print(v[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
