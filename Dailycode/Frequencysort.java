package Dailycode;
// sort the element by frequency the element occurs

// incomplete
public class Frequencysort {
    public static void main(String[] args) {
        int[] arr = {5,8,5,7,8,10};
        occurence(arr);

    }
    static void  occurence(int[] arr){

        for (int index = 0; index < arr.length; index++) {
            int count  =0;
            int flag  = 0;
            for (int j = index+1; j < arr.length; j++) {
                if(arr[index] == arr[j]){
                    flag = 1;
                    continue;
                }
            }

            if(flag ==1) continue; 
    
            for (int j = 0; j <= index; j++) {
             if(arr[index] == arr[j])
             count++;
            }
            System.out.println( arr[index]+": "+count);

        }
      
    }
}
