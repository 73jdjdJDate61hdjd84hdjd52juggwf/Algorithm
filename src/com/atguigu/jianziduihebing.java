package com.atguigu;

/*数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
*/

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class jianziduihebing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int i = Integer.parseInt(in.nextLine());
        int[] inta = new int[2];
        String[] strings = new String[2];
        for (int j = 0; j < i; j++) {
            String mapline = in.nextLine();
            strings = mapline.split(" ");
            inta[0] = Integer.parseInt(strings[0]);
            inta[1] = Integer.parseInt(strings[1]);
            if (map.containsKey(inta[0])) {
                inta[1] = map.get(inta[0])+inta[1];
                map.put(inta[0], inta[1]);
            }
            map.put(inta[0], inta[1]);
        }

        for (int ii:map.keySet()){
            System.out.println(ii+" "+map.get(ii));
        }


    }

}
