package WIPRO;

public class Stringeven {
    public static void main(String[] args) {
        int[] arr = {12,23,34,45,56};
        String  str= "even";
        System.out.println(evenodd(arr, str));

    }
    static int evenodd(int[] arr ,String str){
 int count = 0;
         if(str == "even"){
           for(int i =0 ; i <= arr.length ;i++){

              if(arr[i]%2==0){
                count++;
              }
           }
         }
         return  count;

    }
}
