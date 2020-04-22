package com.atguigu.program;

import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class LearnEnglish {
    /*
    规则1：3位一组
     */
    private static final HashMap<String, String> numMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numMap.put("0", "zero");
        numMap.put("1", "one");
        numMap.put("2", "two");
        numMap.put("3", "three");
        numMap.put("4", "four");
        numMap.put("5", "five");
        numMap.put("6", "six");
        numMap.put("7", "seven");
        numMap.put("8", "eight");
        numMap.put("9", "nine");
        numMap.put("10", "ten");
        numMap.put("11", "eleven");
        numMap.put("12", "twelve");
        numMap.put("13", "thirteen");
        numMap.put("14", "fourteen");
        numMap.put("15", "fifteen");
        numMap.put("16", "sixteen");
        numMap.put("17", "seventeen");
        numMap.put("18", "eighteen");
        numMap.put("19", "nineteen");
        numMap.put("20", "twenty");
        numMap.put("30", "thirty");
        numMap.put("40", "forty");
        numMap.put("50", "fifty");
        numMap.put("60", "sixty");
        numMap.put("70", "seventy");
        numMap.put("80", "eighty");
        numMap.put("90", "ninety");

        while (sc.hasNext()) {
            Long num = Long.valueOf(sc.next());
            String numStr = num.toString();
            if (isValid(numStr)) {
                StringBuilder sb = new StringBuilder();
                int length = numStr.length();
                if (length < 4) {
                    System.out.println(under3(numStr, numMap));
                } else if (length < 7) {
                    String tmp1 = numStr.substring(0, length-3);
                    String tmp2 = numStr.substring(tmp1.length(), length);
                    sb.append(under3(tmp1, numMap));
                    sb.append(" ");
                    sb.append("thousand");
                    sb.append(" ");
                    sb.append(under3(tmp2, numMap));
                    System.out.println(sb.toString());

                } else {
                    String tmp1 = numStr.substring(0, length-6);
                    String tmp2 = numStr.substring(tmp1.length(), length-3);
                    String tmp3 = numStr.substring(tmp1.length()+tmp2.length(), length);
                    sb.append(under3(tmp1, numMap));
                    sb.append(" ");
                    sb.append("million");
                    sb.append(" ");
                    sb.append(under3(tmp2, numMap));
                    sb.append(" ");
                    sb.append("thousand");
                    sb.append(" ");
                    sb.append(under3(tmp3, numMap));
                    System.out.println(sb.toString());
                }
            }
            else
                System.out.println("error");
        }
    }
    private static boolean isValid(String numStr) {
        if (numStr.contains(".")||numStr.contains("-"))
            return false;
        if (numStr.length() > 9)
            return false;
        return true;
    }

    private static String under3(String s, HashMap numMap) {
        StringBuilder sb = new StringBuilder();
        int n = Integer.valueOf(s);
        int bw = n / 100;
        int other = n - bw*100;
        if (bw != 0 ) {
            sb.append(numMap.get(bw+""));
            sb.append(" ");
            sb.append("hundred and ");
        }
        sb.append(under2(String.valueOf(other), numMap));
        return sb.toString();
    }

    private static String under2(String s, HashMap numMap) {
        StringBuilder sb = new StringBuilder();
        int n = Integer.valueOf(s);
        int gw = n % 10;
        n /= 10;
        int sw = n;
        if (sw != 0 && gw != 0) {
            if (sw == 1) {
                sb.append(numMap.get(s));
            } else
                sb.append(numMap.get(sw+"0")).append(" ").append(numMap.get(gw+""));
        } else if (sw !=0 && gw == 0) {
            sb.append(numMap.get(sw+"0"));
        } else {
            sb.append(numMap.get(gw+""));
        }
        return sb.toString();
    }
}