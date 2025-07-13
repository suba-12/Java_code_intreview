package TCS_coding_25.TCS_question25;

//input 5 2 
//output 32 
// 5 th prime and 2 nd prime number but into this formula (a*b -1)
import java.util.Scanner;
public class Primerange {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   sc.close();
   int n = 0 ;
   
   if(a > b){
    n = a;
   }else{
    n = b;
   }

   int num = 2;
   int f = 0;
   int s = 0;

   int count = 0;
   while(count < n){
    if(isprime(num)){
     count++;
     if(count ==a){
     f = num;
     }
     if(count == b){
        s = num;
     }
    
    }
    num++; 
}

  System.out.println((f * s)-1); 
}

  

static boolean isprime(int n){
    if(n < 2 ) return false;
    for (int index = 2; index*index <= n; index++) {
        if(n % index ==0){
        return false;
        }
       
    } 
    return true;     
   }
  


}