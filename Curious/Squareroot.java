package Curious;

public class Squareroot {
    
    public static void main(String[] args) {
        int n =36;
        System.out.println(square(n));
    }

    static int square(int n){
if(n == 0 || n==1)   return n;  
int i =1,res = 1;
 while( res <= n){
    i++;
    res = i*i;
}      
   return i - 1;
        }
        

        
}
