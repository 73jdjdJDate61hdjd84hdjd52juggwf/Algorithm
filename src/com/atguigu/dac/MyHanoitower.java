package com.atguigu.dac;

public class MyHanoitower {

    public static void main(String[] args) {
        myHanoitower(2,'A','B','C');
    }

    /**
     *
     * @param i 塔的个数
     * @param a 位置A
     * @param b 位置B
     * @param c 位置C
     */
    private static void myHanoitower(int i, char a, char b, char c) {

        if (i ==1){
            System.out.println("第1个盘从"+a+"->"+c);
        } else {

            myHanoitower(i-1,a,c,b);
            System.out.println("第"+i+"个盘从"+a+"->"+c);
            myHanoitower(i-1,b,a,c);
        }

    }


}
