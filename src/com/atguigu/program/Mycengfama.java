package com.atguigu.program;


import java.util.Scanner;

public class Mycengfama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            //n种砝码
            int n = Integer.parseInt(scanner.nextLine());

            //砝码的重量
            String m = scanner.nextLine();
            //砝码的数量
            String x = scanner.nextLine();
            //输出可以表示的
            System.out.println(getNum(n,m,x));
        }
        scanner.close();

    }

    private static int getNum(int n, String sm, String sx) {

        //质量的数组
        String[] str1 = sm.split(" ");
        //个数的数组
        String[] str2 = sx.split(" ");


        int[] m = new int[n];
        int[] x = new int[n];

        //总重量sum
        int sum = 0;
        for (int i = 0;i<n;i++){

            m[i] = Integer.parseInt(str1[i]);
            x[i] = Integer.parseInt(str2[i]);

            sum += m[i]*x[i];
        }

        int[] temp = new int[sum + 1];
        temp[0] = 1;
        temp[sum] = 1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < x[i]; j++){
                for (int k = sum; k >= m[i]; k--){

                    if (temp[k-m[i]]==1){
                        temp[k] = 1;
                    }
                }
            }
        }
        //表示的数量
        int count=0;
        for (int i = 0;i<sum+1;i++){
            if (temp[i]==1){
                count++;
            }
        }


        return count;
    }
}
