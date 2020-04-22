package com.atguigu;

import java.util.Scanner;

public class zhengxingzhuanbit {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String Result = Integer.toBinaryString(Integer.parseInt(s));
        int result1 = 0;
        char[] chars = Result.toCharArray();
        for (char c :chars){
            if (c=='1')
                result1++;
        }
        System.out.println(result1);
    }
}
