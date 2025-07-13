package TCS_coding_25.TCS_question25;
import java.util.Scanner;
class Expenditure{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Income:");
      int income = sc.nextInt();
      sc.nextLine();

      String exp[] = new String[100];
      int[] amt = new int[100];
      int count = 0;
      int total = 0;
      while(true){
        System.out.print("tyoes of material :");
        String material = sc.nextLine();
        
        if(material.equalsIgnoreCase("done")){
        break;
        }

        System.out.print("Expenditure :"+" ");
       /*
       while(!sc.hasNextInt()){
            System.out.println("please enter a valid amount");
            sc.next();
        }
        */ 
        int expense = sc.nextInt();
        sc.nextLine();

        if(expense < 0){
            System.out.println("not negative");
            continue;
        }

        exp[count]= material;
        amt[count] = expense;
        total+=expense;
        count++;

      }
System.out.println("\n Total income :" + income);
System.out.println("Total savings"+(income - total));
System.out.println("\nExpenditure :");
for (int index = 0; index < count; index++) {
    System.out.println(exp[index]+":"+amt[index]);
}
sc.close();
      
    }
}