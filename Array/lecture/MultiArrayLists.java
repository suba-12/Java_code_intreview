package Array.lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayLists {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int index = 0; index < 2; index++) {
           list.add(new ArrayList<>())  ;          
        }
        for (int index = 0; index < 2; index++) {
            for (int i = 0; i < 2; i++) {
                list.get(index).add(in.nextInt());
            }
         }
         System.out.println(list);

 
    }
    
}
