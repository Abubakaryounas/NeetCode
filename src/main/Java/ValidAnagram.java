package main.Java;

import java.util.Arrays;

class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
