package WIPRO;

public class Day2 {
    public static void main(String[] args) {
        int n = 5;
      //  integer(n);
        int a,b ;
        
       // Greater(280, 87);
       // even(n);
        //Sum(23,12 );
       // number(10);
      //  alternate(10);
       //alternate1(10);
//backwards(10);
 //backwardstwo(10);
 sumoflast(122 ,123);
    }
// integer
    static void integer(int n ){
        if( n > 0){
            System.out.println("positive");
        }
        else if( n <0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
//gerater
    static void Greater(int a ,int b ){
        int max = a;
        if(a< b ){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }


    //even odd
    static void even(int n){
        if(n % 2== 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    // sum two numbers and find even and odd
    
    static void Sum(int a , int b){
        int sum = a+b;
        if(sum % 2== 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }

    }


    // LOOPING CONCEPT

    // 1 print 1 to 100
    static void number(int n){
        for (int index = 1; index <= n; index++) {
            System.out.println(index);
            
        }
    }

    //alternate numbers 1 - 99

    static void alternate(int n){
        for (int index = 1; index < n; index++) {
           if(index %2 != 0){
            System.out.println(index+"");
           }
            
        }
    }
// alternate numbers 0 - 100
static void alternate1(int n){
    for (int index = 0; index <= n; index++) {
       if(index %2 == 0){
        System.out.println(index+"");
       }
        
    }
}


// backwards
static void backwards(int n){
    for (int index = n; index >=1; index--) {
        System.out.print(index +" ");
    }
}

// skiping two numbers in backwards

static void backwardstwo(int n){
    for (int index = n; index >=1; index-=3) {
            System.out.println(index);
        
    }
}

// sum of last two digit
static void sumoflast(int a , int b ){
    while(a != 0 || b != 0) {
        int sum = b% 10;
        int rem = a %10;
        int ans = sum+rem;
        System.out.println(ans);
        break;
    }
}

}
