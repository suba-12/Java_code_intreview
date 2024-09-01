package WIPRO;
class Last{
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        getLastDigit(a, b);
    }
    static void getLastDigit(int a, int b) {
        // code here
        int c = 1;
        for (int index = 1; index <= b; index++) {
                c = c*a;
            
        }
        
        int rem  = c %10;
        System.out.println(rem); 
    }

}