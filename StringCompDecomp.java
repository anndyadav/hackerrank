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

public class StringCompDecomp {
    public static String StringComp(String s){
        String mystr = "";
        char last = s.charAt(0);
        int count = 1;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(i)==last){
                count++;
            }
            else{
                mystr += last+""+count;
                last = s.charAt(i);
                count = 1;
            }
        }
        return mystr + last + count;
    }
    
    public static String StringDecomp(String s){
        String mystr = "";
        for(int i=0;i<s.length()-1;){
          char last = s.charAt(i);
          int no = Character.getNumericValue(s.charAt(i+1)); 
          while(no!=0){
              mystr+=last+"";
              no--;
          }
            i+=2;
        }
        return mystr;
    }
    
    public static void main(String[] args) {
        String str = new String();
        Scanner s = new Scanner(System.in);
        int choice;
        System.out.println("1. Compression\n2. Decompression");
        choice = s.nextInt();
        switch(choice){
            case 1: str = s.next();
                    String res = StringComp(str);
                    System.out.println(res);
                    break;
            case 2: str = s.next();
                    String result = StringDecomp(str);
                    System.out.println(result);
                    break;
            default: System.out.println("Wrong Choice.");
        }
        
        
    }
  
}
