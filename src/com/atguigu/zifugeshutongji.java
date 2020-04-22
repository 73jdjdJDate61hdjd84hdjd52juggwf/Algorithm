package com.atguigu;

import java.util.ArrayList;
import java.util.Scanner;

/*编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。*/
public class zifugeshutongji {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] chars = s.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (int i=0;i<chars.length;i++){
            if ((int)chars[i]>=0&&(int)chars[i]<=127&&!characters.contains(chars[i])){
                characters.add(chars[i]);
            }
        }
        System.out.println(characters.size());

    }

}
