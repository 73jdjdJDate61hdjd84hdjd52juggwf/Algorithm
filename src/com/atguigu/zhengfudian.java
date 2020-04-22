package com.atguigu;
/*写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。*/
import java.util.Scanner;

public class zhengfudian {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Double d = in.nextDouble();
        int i = new Double(d).intValue();
        if ((d-i)>=0.5)
            System.out.println(i+1);
        else
            System.out.println(i);


    }
}
