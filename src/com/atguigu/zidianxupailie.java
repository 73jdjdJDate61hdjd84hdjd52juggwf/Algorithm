package com.atguigu;
/*给定n个字符串，请对n个字符串按照字典序排列。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zidianxupailie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i=0;i<Integer.parseInt(s);i++){
            stringArrayList.add(in.nextLine());
        }
        Collections.sort(stringArrayList);
        for (String s1: stringArrayList){
            System.out.println(s1);
        }
    }
}
