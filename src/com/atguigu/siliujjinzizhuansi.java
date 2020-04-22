package com.atguigu;

import java.util.Scanner;

/**写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）

 */
public class siliujjinzizhuansi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s = in.nextLine();
            String s1 = CodeLength(s.substring(2,s.length()));
            System.out.println(s1);
        }



    }
    public static String CodeLength(String s1){
        int[] data = new int[s1.length()];
        int result =0;
        for (int i=0;i<s1.length();i++) {
            String siliu = s1.substring(i,i+1);
            switch (siliu){
                case "A":
                    data[i] = 10;
                    break;
                case "B":
                    data[i] = 11;
                    break;
                case "C":
                    data[i] = 12;
                    break;
                case "D":
                    data[i] = 13;
                    break;
                case "E":
                    data[i] = 14;
                    break;
                case "F":
                    data[i] = 15;
                    break;
                default: data[i] =Integer.parseInt(siliu);
            }
            result += data[i]*Math.pow(16,s1.length()-i-1);
        }
        return String.valueOf(result);
    }
}
