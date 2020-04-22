package com.atguigu;

import java.util.Scanner;

public class zifugeshu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        String s1 = in.nextLine();
        char c1 =s1.toCharArray()[0];
        CodeLength(c,c1);

    }
    public static void CodeLength(char[] s,char s1){
        int n=0;
        for(char c1:s){
            if (Character.toLowerCase(c1)==Character.toLowerCase(s1))
                n++;
        }
        System.out.println(n);
    }
}
