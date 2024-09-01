public class Countnumbers {
    public static void main(String[] args) {
        int a= 45536;
        int count = 0;
        while(a >0){
            int rem = a%10;
            
            if(rem == 3){
                count++;
            }
            a = a/10;
        }
      System.out.println(count);
    }
}
