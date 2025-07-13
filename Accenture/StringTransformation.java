package Accenture;
import java.util.Scanner;

import String.Stringbuilder1;
public class StringTransformation {
   public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String  str = "abbaac";
  String transform = transformation(str);
  System.out.println(transform);
   } 
   static  String transformation(String str){
    String trans = "";

    for(int i =0; i< str.length(); i++){
        char current = str.charAt(i);
        if(current =='a'){
          trans +='b';
        }else if(current =='b'){
            trans +='a';
    }else{
        trans += current;
    }
    }
    return trans;
   }
}
