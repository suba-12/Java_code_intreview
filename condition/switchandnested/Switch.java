package switchandnested;

import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
    Scanner in =  new Scanner(System.in);
    int fruite = in.nextInt();

    switch(fruite){
       case 1,2,3,4,5 -> System.out.println("weekday");
       case 6,7 -> System.out.println("weekend");
       default -> System.out.println("no other days");
}
}
}


/*
"" alt enter "" for changing to new syntax
  switch(fruite){
        case("apple"):{
            System.out.println("apple fruite");
            break;
        }
        case("pine"):{
            System.out.println("pineapple fruite");
            break;
        }
        case("banana"):{
            System.out.println("yellow fruite");
            break;
        }
        default:{
            System.out.println("no valid");
        }

 */
