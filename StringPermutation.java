/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anand Yadav
 */
import java.util.Scanner;

public class StringPermutation {
    public static String sort(String s){
        char[] arr = s.toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
    
    public static boolean permutation(String s, String p){
        if(s.length()>p.length())return false;
        
        return sort(s).equals(sort(p));
    }
    
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String();
        Scanner s = new Scanner(System.in);
        str1 = s.next();
        str2 = s.next();
        
        boolean res = permutation(str1,str2);
        System.out.println(res);
    }
    
}
