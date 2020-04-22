package com.atguigu;

import java.util.Scanner;

public class zifuchuan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        CodeLength(s);

    }
    public static void CodeLength(String s){
        String [] str = s.split(" ");
        int length = str.length;
        System.out.println(str[length-1].length());
    }
}
