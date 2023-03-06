package com.cts.practicestream;

public class CommonLongestSubstring {
    
    public static String findCommonLongestSubstring(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        
        String firstStr = arr[0];
        int len = firstStr.length();
        String result = "";
        
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = firstStr.substring(i, j);
                int k = 1;
                for (k = 1; k < arr.length; k++) {
                    if (!arr[k].contains(substring)) {
                        break;
                    }
                }
                if (k == arr.length && result.length() < substring.length()) {
                    result = substring;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String[] arr = {"abcd", "abcf", "bcdf", "abcdxyz"};
        String substring = findCommonLongestSubstring(arr);
        System.out.println("Common longest substring is: " + substring);
    }
}
