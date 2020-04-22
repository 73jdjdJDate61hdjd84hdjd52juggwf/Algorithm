package com.atguigu;
/*输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class norepeatint {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        ArrayList<Character> objects = new ArrayList<>();
        String result ="";
        for (int i=chars.length-1;i>=0;i--){
            if (objects.contains(chars[i])){

            }else {
                objects.add(chars[i]);
                result=result+String.valueOf(chars[i]);
            }
        }
        System.out.println(Integer.parseInt(result));


    }

}
