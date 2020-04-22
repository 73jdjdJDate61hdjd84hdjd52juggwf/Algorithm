package com.atguigu;

import java.util.Scanner;

public class zifuchuanfanzhuan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] c = s.toCharArray();
        String result="";
        for (int i=0;i<c.length;i++){
            result = String.valueOf(c[i])+result;
        }
        System.out.println(result);

    }

}
