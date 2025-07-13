package TCS_coding_25.TCS_question24;
/*
 Input : 286

Output:

Number 286 is a three-digit number but not divisible by 9.
 */
import java.util.Scanner;
public class Threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(100 <= n || n >=999){
            if(n%9 ==0){
                System.out.println("Number "+n+" is a three-digit number  divisible by 9.");
            }else{
                System.out.println("Number"+n+" 286 is a three-digit number but not divisible by 9.");
            }
        }
       
    else{
        System.out.println(" Number"+n+" 286 is a three-digit ");
    }
    }
    

    }

