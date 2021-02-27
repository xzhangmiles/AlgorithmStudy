package com.zhang.greedy;

public class IsSubsequence392 {

    public static void main(String[] args){
        String s;
        String t;
        boolean result;

        //example 1: expected output: true
        s = "abc";
        t = "ahbgdc";
        result = isSubsequence(s,t);
        System.out.println(result);

        //example 1: expected output: false
        s = "axc";
        t = "ahbgdc";
        result = isSubsequence(s,t);
        System.out.println(result);

        //example 3: expected output: true
        s = "ace";
        t = "abcde";
        result = isSubsequence(s,t);
        System.out.println(result);

        //example 4: expected output: false
        s = "aec";
        t = "abcde";
        result = isSubsequence(s,t);
        System.out.println(result);

    }

    public static boolean isSubsequence(String s, String t) {

        if (s.length()==0) return true;

        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < t.length()){
            if (s.charAt(sPointer) == t.charAt(tPointer)){
                //if (sPointer == s.length()-1) return true;
                sPointer ++; // if sPointer points to the last letter of s, then sPointer = s.length()-1
                            //then sPointer++ will make it to s.length
                            //that is why next line code it should be s.length()
                if (sPointer == s.length()) return true;
            }
            tPointer ++;
        }
        return false;

    }


}
