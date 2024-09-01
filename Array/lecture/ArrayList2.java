package Array.lecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("eneter the 5 elements :"+" ");
    for (int index = 0; index < 5; index++) {
        list.add(in.nextInt());
    }
    
    for (int index = 0; index < 5; index++) {
        System.out.print(list.get(index)+" ");
    }

  //  System.out.println(list);
    }
}
