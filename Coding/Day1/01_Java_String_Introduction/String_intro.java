/*
Given two strings of lowercase English letters, A and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B(i.e.: does B come before A in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.

Lexicographically:
------------------------------------------------------------------------------------------------------------------------------------
"Lexicographically" refers to the way of ordering or comparing items based on dictionary order. This is similar to how words 
are arranged alphabetically in a dictionary. In a lexicographical order, the first characters of each item are compared
first; if they are the same, the next characters are compared, and so on.

"apple" < "banana" < "cherry".
"A < B < C < D so on"
------------------------------------------------------------------------------------------------------------------------------------

compareTo():
------------------------------------------------------------------------------------------------------------------------------------
Returns:	
            An int value: 0 if the string is equal to the other string.
            < 0 if the string is lexicographically less than the other string
            > 0 if the string is lexicographically greater than the other string (more characters)
------------------------------------------------------------------------------------------------------------------------------------

Link : https://www.w3schools.com/java/ref_string_compareto.asp
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len1 = A.length();
        int len2 = B.length();
        System.out.println(len1+len2);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String a = (A.substring(0,1)).toUpperCase() + A.substring(1);
        String b = (B.substring(0,1)).toUpperCase() + B.substring(1);
        System.out.println(a + " " + b);
    }
}

