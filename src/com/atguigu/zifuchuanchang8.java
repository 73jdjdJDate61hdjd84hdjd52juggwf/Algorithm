package com.atguigu;

/*•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。*/
 import java.util.Scanner;

public class zifuchuanchang8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            String s = in.nextLine();
////            char[] ca = s.toCharArray();
            int start =0;
            int end =8;
            for (int i=start;i<s.length()/8;i++){
                System.out.println(s.substring(start,end));
                start +=8;
                end += 8;

            }
            if (s.length()%8!=0) {
                String k = "";
                int sl = s.length() % 8;
                int s2 = s.length() / 8;
                int s3 = s2 * 8;
                int s4 = s.length();
                k = s.substring(s3, s4);
                for (int i = 0; i < 8 - sl; i++) {

                    k += "0";
                }
                System.out.println(k);
            }
        }
    }

}
