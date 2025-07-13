package TCS_coding_25.TCS_question24;
/*
 ### **Example:**

**Input:**

3 90 John 85 Bob 92 Alice 110 Aditya

**Output:**

Aditya: 110

Alice: 100

John: 90
 */
import java.util.Scanner;
public class TopCandides {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] score = new int[n];
    String[] name =new String[n];

    for(int i = 0 ; i< n ; i++){
        score[i] = sc.nextInt();
        name[i]=sc.next();
    }

    //sort
    for (int index = 0; index < n; index++) {
        for (int j = 0; j < n-1-index; j++) {
            if(score[j] < score[j+1]){
                int temps = score[j];
                score[j] = score[j+1];
                score[j+1]= temps;


                String tempn = name[j];
                name[j] = name[j+1];
                name[j+1]=tempn;
            }
        }
        
    }

    for (int index = 0; index < n; index++) {
        System.out.println(name[index] + " : " + score[index]);
    }
    sc.close();
  }  
}
