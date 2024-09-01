package WIPRO;
// taking the smallest element int a,b,c and taking the largest element in the a,b,c and make the differenece
public class Test1 {
    public static void main(String[] args) {
        int a= 1238;
        int b = 4566;
        int c = 6708;
System.out.println(finalfun(a, b, c));

    }


static int finalfun(int a , int b, int c){
    int minvalue = getMin(a)+getMin(b)+getMin(c);
    int maxvalue = getMax(a)+getMax(b)+getMax(c);

    
    return maxvalue - minvalue;
}


static int getMin(int num){
int min = 9;
    while(num >0){
        int rem = num%10;

     if(min > rem){
        min = rem;
     }
     num /=10;        

    }
    return min;
}


static int getMax(int num){
    int max = 0;
        while(num >0){
            int rem = num%10;
    
         if(max < rem){
            max= rem;
         }
         num /=10;        
    
        }
        return max;
    }
}


/*static int digit(int num){
    while(num != 0){
        int rem = num%10;
        num /=10;        
    }
    return num;
}
}
*/
