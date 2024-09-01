package Array.lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(78);
    list.add(56);
    list.add(788);
    System.out.println(list);
    System.out.println(list.contains(78));
    
   list.set(2 ,67);
   System.out.println(list);


   } 
}
