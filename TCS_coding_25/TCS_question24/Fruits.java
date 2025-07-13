package TCS_coding_25.TCS_question24;
/*
 apple 1.0 5
orange 10.0 5
apple 10.0 5

apple
105.00
35.00
 */
import  java.util.Scanner;
import java.util.Scanner;
public class Fruits {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      String[] items = items = new String[n];
      double[] totalsel = new double[n];
      int uni = 0;
      String item ="";
      double maxprice = 0.0;
      double totprice = 0.0;
      int itemcount = 0;

    for(int i = 0 ; i < n ; i++){
        String name = sc.next();
        double  price= sc.nextDouble();
        int qua = sc.nextInt();
        
        double sp = price*qua;
        totprice = totprice+sp;
        itemcount++;
        boolean found = false;
        for(int j = 0 ; j < uni ; j++){
            
           if(items[j].equals(name)){
            
           }
    
        }
      
      }
      sc.close();
      System.out.println(item);
      System.out.printf("%.2f\n" , totprice);
      System.out.printf("%.2f\n",(itemcount >0 )? (totprice /itemcount):0.0);

    }
}
