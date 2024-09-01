package WIPRO;

public class Specificrangeprime {
    public static void main(String[] args) {
        int s = 1;
        int e = 10;
      //  int n = 10;
  //    int count = 0;
      
      for(int i = s ;i<=e;i++){
       if(prime(i)== 1){
        System.out.print(i+" ");
       // count++;

        }
      }
     // System.out.println(count);

    }

    static int prime(int n){
        
        for (int index = 2; index < n; index++) {
            if(n%index ==0){
                return -1;
            }
           

        }
    
        return 1;
    }

    
}
