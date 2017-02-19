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

public class UniqueChar {
    public static boolean method(String s){
        if(s.length()>256) return false;
        
        boolean[] arr = new boolean[256];
        for(int i=0;i<s.length();i++){
            int k = s.charAt(i);
            if(arr[k]){
                return false;
            }
            arr[k] = true;
        }
       return true; 
    }
    
    public static void main(String[] args) {
        String a = new String();
        Scanner s = new Scanner(System.in);
        a = s.next();
        boolean res = method(a);
        System.out.println(res);
        
    }
    
}
