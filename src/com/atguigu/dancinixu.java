package com.atguigu;

import java.util.Scanner;

public class dancinixu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        String result ="";
        for (String s2 :s1){
            result = " " +s2 + result;
        }
        System.out.println(result.trim());

    }

}