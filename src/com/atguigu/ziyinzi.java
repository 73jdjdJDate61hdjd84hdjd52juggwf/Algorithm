package com.atguigu;

import java.util.Scanner;

/*输入一个正整数，按照从小到大的顺序输出它的所有质因子*/
public class ziyinzi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(getResult(num));
        
    }
    public static String getResult(long num){
        int a = 2;
        String result = "";
        while(num != 1){
            while(num%a ==0){
                num = num / a;
                result = result + a +" ";
            }
            a++;
        }
        return result;
    }
}
