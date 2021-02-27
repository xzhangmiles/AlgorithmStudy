package com.zhang.greedy;

import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {

        int result;

        int[] g1 = {1,2,3};
        int[] s1 = {1,1};
        result = findContentChildren(g1,s1);
        System.out.println(result);

        int[] g2 = {1,2};
        int[] s2 = {1,2,3};
        result = findContentChildren(g2,s2);
        System.out.println(result);

        int[] g3 = {10,9,8,7};
        int[] s3 = {5,6,7,8};
        result = findContentChildren(g3,s3);
        System.out.println(result);


    }
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int gPointer = 0;
        int sPointer = 0;

        int max=0;

        while (sPointer < s.length){
            if (s[sPointer]>=g[gPointer]){
                max++;
                if (max==g.length) return max;
                gPointer++;

            }

            sPointer++;
        }
        return max;

    }
}
