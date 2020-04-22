package com.atguigu.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyGreedy {
    public static void main(String[] args) {

        HashMap<String, HashSet> broadscast = new HashMap<>();
        HashSet<String> broad1 = new HashSet<>();
        broad1.add("北京");
        broad1.add("上海");
        broad1.add("天津");

        HashSet<String> broad2 = new HashSet<>();
        broad2.add("广州");
        broad2.add("北京");
        broad2.add("深圳");
        HashSet<String> broad3 = new HashSet<>();
        broad3.add("成都");
        broad3.add("上海");
        broad3.add("杭州");
        HashSet<String> broad4 = new HashSet<>();
        broad4.add("上海");
        broad4.add("天津");

        HashSet<String> broad5 = new HashSet<>();
        broad5.add("杭州");
        broad5.add("大连");

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("广州");
        allAreas.add("北京");
        allAreas.add("深圳");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");

        broadscast.put("K1",broad1);
        broadscast.put("K2",broad2);
        broadscast.put("K3",broad3);
        broadscast.put("K4",broad4);
        broadscast.put("K5",broad5);
        HashSet<Object> tempSet = new HashSet<>();
        String maxKey = null;
        ArrayList<Object> selectedkey = new ArrayList<>();
        while (!allAreas.isEmpty()){


            maxKey = null;
            for (String areak:broadscast.keySet()){
                tempSet.clear();
                HashSet area;
                area = broadscast.get(areak);
                tempSet.addAll(area);
                tempSet.retainAll(allAreas);

                if (tempSet.size()>0 && (maxKey == null ||
                        tempSet.size() > broadscast.get(maxKey).size())){

                    maxKey = areak;

                }


            }
            if (maxKey!=null){

                selectedkey.add(maxKey);
                allAreas.removeAll(broadscast.get(maxKey));
            }

        }


        System.out.println(selectedkey);

    }
}
